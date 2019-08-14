package com.swind.cloud.hotel.v2.mapper;

import com.swind.cloud.hotel.v2.entity.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * UserDAO继承基类
 */
public interface UserDAO extends Mapper<User> {

    /**
     * 通过登录名获取帐号信息
     * @param name
     * @return
     */
    User getByName(String name);

    /**
     * 通过手机号获取帐号信息
     * @param phone
     * @return
     */
    User getByPhone(String phone);
}