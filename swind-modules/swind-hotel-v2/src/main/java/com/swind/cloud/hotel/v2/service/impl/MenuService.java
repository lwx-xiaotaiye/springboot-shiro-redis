package com.swind.cloud.hotel.v2.service.impl;

import com.swind.cloud.hotel.v2.entity.Menu;
import com.swind.cloud.hotel.v2.mapper.MenuDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {
    @Resource
    private MenuDAO menuDAO;

    public List<Menu> getAllMenuByRoleId(Integer roleId){
        return menuDAO.getAllMenuByRoleId(roleId);
    }
}
