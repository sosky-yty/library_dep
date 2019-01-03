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

import io.renren.modules.generator.entity.BorrowBooksEntity;
import io.renren.modules.generator.service.BorrowBooksService;
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
@RequestMapping("generator/borrowbooks")
public class BorrowBooksController {
    @Autowired
    private BorrowBooksService borrowBooksService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:borrowbooks:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = borrowBooksService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    @RequiresPermissions("generator:borrowbooks:info")
    public R info(@PathVariable("userId") Integer userId){
			BorrowBooksEntity borrowBooks = borrowBooksService.selectById(userId);

        return R.ok().put("borrowBooks", borrowBooks);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:borrowbooks:save")
    public R save(@RequestBody BorrowBooksEntity borrowBooks){
			borrowBooksService.insert(borrowBooks);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:borrowbooks:update")
    public R update(@RequestBody BorrowBooksEntity borrowBooks){
			borrowBooksService.updateById(borrowBooks);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:borrowbooks:delete")
    public R delete(@RequestBody Integer[] userIds){
			borrowBooksService.deleteBatchIds(Arrays.asList(userIds));

        return R.ok();
    }

}
