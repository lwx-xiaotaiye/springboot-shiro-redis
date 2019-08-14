package com.swind.cloud.hotel.v2.mapper;

import com.swind.cloud.hotel.v2.entity.Coupon;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CouponMapper extends Mapper<Coupon> {
    public List<Coupon> selectHomeCouponList(@Param("offset")Integer offset, @Param("limit")Integer limit);
}