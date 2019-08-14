package com.swind.cloud.hotel.v2.service.impl;

import com.swind.cloud.hotel.v2.entity.Role;
import com.swind.cloud.hotel.v2.mapper.RoleDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleService {
    @Resource
    private RoleDAO roleDAO;

    public List<Role> findByUserid(Integer userId){
        return roleDAO.findByUserId(userId);
    }
}
