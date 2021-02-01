package com.mkl.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mkl.common.utils.PageUtils;
import com.mkl.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 19:57:03
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

