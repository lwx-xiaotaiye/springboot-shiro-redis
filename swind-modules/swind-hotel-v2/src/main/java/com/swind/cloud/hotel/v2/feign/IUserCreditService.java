package com.swind.cloud.hotel.v2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import com.swind.cloud.security.auth.configuration.FeignConfiguration;

import java.util.Map;

@FeignClient(value = "swind-hotel")
public interface IUserCreditService {
    @RequestMapping(value = "/api/user/credit/award", method = RequestMethod.POST)
    public String awardAction(@RequestBody Map<String, Object> body);
}