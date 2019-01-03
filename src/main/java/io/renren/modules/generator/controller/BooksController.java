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

import io.renren.modules.generator.entity.BooksEntity;
import io.renren.modules.generator.service.BooksService;
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
@RequestMapping("generator/books")
public class BooksController {
    @Autowired
    private BooksService booksService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:books:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = booksService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{bookId}")
    @RequiresPermissions("generator:books:info")
    public R info(@PathVariable("bookId") String bookId){
			BooksEntity books = booksService.selectById(bookId);

        return R.ok().put("books", books);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:books:save")
    public R save(@RequestBody BooksEntity books){
			booksService.insert(books);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:books:update")
    public R update(@RequestBody BooksEntity books){
			booksService.updateById(books);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:books:delete")
    public R delete(@RequestBody String[] bookIds){
			booksService.deleteBatchIds(Arrays.asList(bookIds));

        return R.ok();
    }

}
