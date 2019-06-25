package com.xkj.service;

import com.xkj.dto.OrderDTO;

/**
 * 买家Service
 * Created by JIN on 2019/6/24.
 */
public interface BuyerService {
    //查询订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancel(String openid,String orderId);
}
