package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.BooksDao;
import io.renren.modules.generator.entity.BooksEntity;
import io.renren.modules.generator.service.BooksService;


@Service("booksService")
public class BooksServiceImpl extends ServiceImpl<BooksDao, BooksEntity> implements BooksService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BooksEntity> page = this.selectPage(
                new Query<BooksEntity>(params).getPage(),
                new EntityWrapper<BooksEntity>()
        );

        return new PageUtils(page);
    }

}
