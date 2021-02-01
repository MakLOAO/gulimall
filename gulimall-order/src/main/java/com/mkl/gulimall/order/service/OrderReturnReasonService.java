package com.mkl.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mkl.common.utils.PageUtils;
import com.mkl.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 20:17:37
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

