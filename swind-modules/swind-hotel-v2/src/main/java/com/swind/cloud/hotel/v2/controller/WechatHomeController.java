package com.swind.cloud.hotel.v2.controller;

import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swind.cloud.v2.common.msg.ObjectRestResponse;
import com.swind.cloud.v2.common.msg.TableResultResponse;
import com.swind.cloud.hotel.v2.service.CouponService;
import com.swind.cloud.v2.common.util.Query;
import com.swind.cloud.hotel.v2.entity.Coupon;

import com.swind.cloud.hotel.v2.feign.IUserCreditService;

import lombok.extern.slf4j.Slf4j;
import java.util.Map;
import java.util.HashMap;

@Slf4j
@RestController
@RequestMapping("/cloud/v2/wechat")
public class WechatHomeController {
    @Autowired
    CouponService couponService;

    @Autowired
    private IUserCreditService userCreditService;

    @RequestMapping(value = "/couponList", method = RequestMethod.POST)
    @ResponseBody
    public TableResultResponse<Coupon> couponListAction(@RequestBody Map<String, Object> params) throws Exception {
        Query query = new Query(params);
        return couponService.selectByQuery(query);
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse<?> wechatHomeAction() throws Exception {
        return new ObjectRestResponse<String>().ok().data("abc");
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    @ResponseBody
    public String demoAction() throws Exception {
        log.info("demo action!");
        return "demo Action";
    }

    @RequestMapping(value = "/demoAward", method = RequestMethod.GET)
    @ResponseBody
    public String demoAwardAction() throws Exception {
        log.info("demo award action!");

        Map<String, Object> body = new HashMap<String, Object>();
        // body.put("name", "allen");
        body.put("userId", "10");
        body.put("shareUserId", "1919");
        body.put("point", "30");
        String result = userCreditService.awardAction(body);

        return result;
    }
}
