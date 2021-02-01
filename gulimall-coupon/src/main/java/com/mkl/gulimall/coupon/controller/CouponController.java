package com.mkl.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mkl.gulimall.coupon.entity.CouponEntity;
import com.mkl.gulimall.coupon.service.CouponService;
import com.mkl.common.utils.PageUtils;
import com.mkl.common.utils.R;



/**
 * 优惠券信息
 *
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 19:57:03
 */
@ConfigurationProperties(prefix = "coupon.user")
@Data
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

//    @Value("${coupon.user.name}")
    private String name;

//    @Value("${coupon.user.age}")
    private Integer age;

    private Integer mybatis;
    private Integer datasource;

    @RequestMapping("/test")
    public R test() {
        return R.ok()
                .put("name", name)
                .put("age", age)
                .put("mybatis", mybatis)
                .put("datasource", datasource);
    }

    @RequestMapping("/member/list")
    public R membercoupons() {
        CouponEntity wCouponEntity = new CouponEntity();
        wCouponEntity.setCouponName("满100减10");
        return R.ok().put("coupons", Arrays.asList(wCouponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
