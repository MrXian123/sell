package com.xkj.conver;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xkj.OrderForm;
import com.xkj.dto.OrderDTO;
import com.xkj.entity.OrderDetail;
import com.xkj.enums.ResultEnum;
import com.xkj.exception.SellException;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单form参数转换类
 * Created by JIN on 2019/6/2.
 */
@Slf4j
public class OrderFormToOrderDtoConver {
    public static OrderDTO conver(OrderForm orderForm) {
        OrderDTO orderDTO = new OrderDTO();
        Gson gson = new Gson();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {}.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误，string= {}", orderForm.getItems());
            throw new SellException(ResultEnum.PRODUCT_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
