package com.xkj.service;

import com.xkj.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 订单service
 * Created by JIN on 2019/5/16.
 */
public interface OrderService {

    /** 创建订单*/
    OrderDTO create(OrderDTO orderDTO);

    /** 查下单个订单*/
    OrderDTO findOne(String orderId);

    /** 查下订单列表*/
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /** 取消订单 */
    OrderDTO cancel(OrderDTO orderDTO);

    /** 完结订单*/
    OrderDTO finish(OrderDTO orderDTO);

    /** 支付订单*/
    OrderDTO paid(OrderDTO orderDTO);



}
