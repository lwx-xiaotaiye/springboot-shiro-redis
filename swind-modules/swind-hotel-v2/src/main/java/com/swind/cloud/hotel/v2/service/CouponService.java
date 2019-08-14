package com.swind.cloud.hotel.v2.service;

import com.swind.cloud.hotel.v2.entity.Coupon;
import com.swind.cloud.v2.common.service.BaseService;
import com.swind.cloud.v2.common.msg.PageResultResponse;
import com.swind.cloud.v2.common.msg.TableResultResponse;
import com.swind.cloud.v2.common.util.EntityUtils;
import com.swind.cloud.v2.common.util.Query;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public interface CouponService extends BaseService<Coupon> {
    TableResultResponse<Coupon> selectByQuery(Query query);
}
