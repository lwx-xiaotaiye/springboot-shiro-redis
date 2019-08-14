package com.swind.cloud.hotel.v2.shiro;

import com.alibaba.fastjson.JSON;
import com.swind.cloud.hotel.v2.enums.ResultStatusCode;
import com.swind.cloud.hotel.v2.vo.Result;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;

/**
 * @description:TODO
 * @author: lwx
 * @created:
 **/
public class ShiroFormAuthenticationFilter extends FormAuthenticationFilter {
    //检查是否登录成功
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) {
        if (super.isAccessAllowed(servletRequest,servletResponse,o)) {
            Object a = getSubject(servletRequest, servletResponse).getPrincipal();
            String b = a.toString();
        }
       return super.isAccessAllowed(servletRequest,servletResponse,o);
    }

    //登录失败
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);
        if(subject.isAuthenticated() || subject.isRemembered()) {
            //如果登录了，直接进行之后的流程

            return true;
        }

        subject.logout();

        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println(JSON.toJSONString(new Result(ResultStatusCode.INVALID_TOKEN)));
        out.flush();
        out.close();

        return false;
    }
}