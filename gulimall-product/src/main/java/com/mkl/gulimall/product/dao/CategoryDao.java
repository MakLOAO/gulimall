package com.mkl.gulimall.product.dao;

import com.mkl.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 19:25:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
