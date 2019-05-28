package com.xkj.conver;

import com.xkj.dto.OrderDTO;
import com.xkj.entity.OrderMaster;
import org.hibernate.criterion.Order;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 订单实体转换类
 * Created by JIN on 2019/5/29.
 */
public class OrderMasterToOrderDtoConverter {

    public static OrderDTO conver(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> conver(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
                conver(e)
        ).collect(Collectors.toList());
    }
}
