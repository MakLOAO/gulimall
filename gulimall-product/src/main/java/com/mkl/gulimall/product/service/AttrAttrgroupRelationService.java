package com.mkl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mkl.common.utils.PageUtils;
import com.mkl.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 19:25:15
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

