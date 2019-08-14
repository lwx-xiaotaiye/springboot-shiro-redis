package com.swind.cloud.hotel.v2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swind.cloud.hotel.v2.service.CouponService;
import com.swind.cloud.hotel.v2.entity.Coupon;
import com.swind.cloud.hotel.v2.biz.CouponBiz;

import com.swind.cloud.v2.common.service.impl.BaseServiceImpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.swind.cloud.v2.common.msg.TableResultResponse;
import com.swind.cloud.v2.common.util.Query;
import com.swind.cloud.hotel.v2.mapper.CouponMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CouponServiceImpl extends BaseServiceImpl<CouponMapper, Coupon> implements CouponService {

    @Autowired
    private CouponBiz couponBiz;

    @Override
    public TableResultResponse<Coupon> selectByQuery(Query query) {
        return couponBiz.selectByQuery(query);
    }
}