package com.swind.cloud.hotel.v2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * sys_user
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "swind_community_management_user")
public class User implements Serializable {
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "sex")
    private String sex;

    @Column(name = "crt_time")
    private Date crtTime;

    @Column(name = "upd_time")
    private Date updTime;

    @Transient
    private String[] roleName;
}