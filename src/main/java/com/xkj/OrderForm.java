package com.xkj;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 买家订单form
 * Created by JIN on 2019/6/2.
 */
@Data
public class OrderForm {

    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名不能空")
    private String name;

    /**
     * 买家电话
     */
    @NotEmpty(message = "电话不能空")
    private String phone;

    /**
     * 买家地址
     */
    @NotEmpty(message = "地址不能空")
    private String address;

    /**
     * 买家openid
     */
    @NotEmpty(message = "openId不能空")
    private String openid;

    /**
     * 购物车信息
     */
    @NotEmpty(message = "购物车不能空")
    private String items;
}
