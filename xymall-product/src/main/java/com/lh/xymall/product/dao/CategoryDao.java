package com.lh.xymall.product.dao;

import com.lh.xymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-11 23:19:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
