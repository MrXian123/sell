package com.xkj.dto;

import com.xkj.entity.OrderDetail;
import com.xkj.enums.OrderStatusEnum;
import com.xkj.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by JIN on 2019/5/16.
 */
@Data
public class OrderDTO {
    /**订单Id*/
    private String orderId;

    /**买家名字*/
    private String buyerName;

    /**买家电话*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家微信openId*/
    private String buyerOpenid;

    /**订单金额*/
    private BigDecimal orderAmount;

    /**订单状态 默认为0新下单*/
    private Integer orderStatus;

    /**支付状态 默认0未支付*/
    private Integer payStatus;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
