package com.mkl.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mkl.common.utils.PageUtils;
import com.mkl.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 19:57:03
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

