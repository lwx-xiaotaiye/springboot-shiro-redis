package com.swind.cloud.hotel.v2.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.swind.cloud.hotel.v2.entity.Coupon;
import com.swind.cloud.hotel.v2.entity.User;
import com.swind.cloud.hotel.v2.mapper.CouponMapper;
import com.swind.cloud.hotel.v2.mapper.UserDAO;
import com.swind.cloud.hotel.v2.vo.Grid;
import com.swind.cloud.v2.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService extends BaseServiceImpl<UserDAO, User> {

    public Grid findList(){
        Grid grid = new Grid();

        Page page = PageHelper.offsetPage(0, 10, true);
//        userDAO.findList(null);

        grid.setRows(page.getResult());
        grid.setTotal(page.getTotal());

        return grid;
    }

    public User getUserByName(String name){
        User user = new User();
        user.setUserName(name);
        return this.mapper.selectOne(user);
    }


    public User getByOpenid(String openid){
        //这里假装是通过openid从数据库中获取到用户信息
        User user = new User();
//        user.setName("张三");
//        user.setLoginName("zhangsan");
//        user.setPhone("18888888888");
//        user.setId(1);
//        user.setLoginFlag("1");

        return user;
    }

    public User getByPhone(String phone){
        return this.getByPhone(phone);
    }
}
