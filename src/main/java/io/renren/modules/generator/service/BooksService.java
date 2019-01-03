package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.BooksEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-01-03 23:12:24
 */
public interface BooksService extends IService<BooksEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

