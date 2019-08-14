package com.swind.cloud.hotel.v2.biz;

import com.swind.cloud.hotel.v2.entity.Coupon;
import com.swind.cloud.hotel.v2.mapper.CouponMapper;
import com.swind.cloud.v2.common.biz.BaseBiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class CouponBiz extends BaseBiz<CouponMapper, Coupon> {
}
