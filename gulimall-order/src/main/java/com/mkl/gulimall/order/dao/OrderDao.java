package com.mkl.gulimall.order.dao;

import com.mkl.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 20:17:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
