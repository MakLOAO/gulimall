package com.mkl.gulimall.coupon.dao;

import com.mkl.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 19:57:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
