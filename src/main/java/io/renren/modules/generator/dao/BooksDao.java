package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.BooksEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-01-03 23:12:24
 */
@Mapper
public interface BooksDao extends BaseMapper<BooksEntity> {
	
}
