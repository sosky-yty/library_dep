package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.BorrowBooksDao;
import io.renren.modules.generator.entity.BorrowBooksEntity;
import io.renren.modules.generator.service.BorrowBooksService;


@Service("borrowBooksService")
public class BorrowBooksServiceImpl extends ServiceImpl<BorrowBooksDao, BorrowBooksEntity> implements BorrowBooksService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BorrowBooksEntity> page = this.selectPage(
                new Query<BorrowBooksEntity>(params).getPage(),
                new EntityWrapper<BorrowBooksEntity>()
        );

        return new PageUtils(page);
    }

}
