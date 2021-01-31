package com.mkl.gulimall.member.feign;

import com.mkl.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author makaloo
 * @description
 * @create 2021-01-11 22:10
 **/
@FeignClient("gulimall-coupon") // 服务名
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R membercoupons();
}
