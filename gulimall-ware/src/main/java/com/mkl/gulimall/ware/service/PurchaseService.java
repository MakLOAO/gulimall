package com.mkl.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mkl.common.utils.PageUtils;
import com.mkl.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 20:21:42
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

