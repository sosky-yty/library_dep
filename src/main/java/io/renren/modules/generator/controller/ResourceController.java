package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.ResourceEntity;
import io.renren.modules.generator.service.ResourceService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-01-03 23:12:24
 */
@RestController
@RequestMapping("generator/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:resource:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resourceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:resource:info")
    public R info(@PathVariable("id") Integer id){
			ResourceEntity resource = resourceService.selectById(id);

        return R.ok().put("resource", resource);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:resource:save")
    public R save(@RequestBody ResourceEntity resource){
			resourceService.insert(resource);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:resource:update")
    public R update(@RequestBody ResourceEntity resource){
			resourceService.updateById(resource);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:resource:delete")
    public R delete(@RequestBody Integer[] ids){
			resourceService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
