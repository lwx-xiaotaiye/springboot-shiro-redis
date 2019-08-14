package com.swind.cloud.hotel.v2.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "swind_hotel_coupon")
public class Coupon {
    @Id
    private Integer id;

    @Column(name = "merchant_id")
    private Integer merchantId;

    @Column(name = "title")
    private String title;

    @Column(name = "point")
    private Integer point;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Integer status;

    @Column(name = "crt_time")
    private Date crtTime;

    @Column(name = "upd_time")
    private Date updTime;
}
