package com.xkj.enums;

import lombok.Getter;

/**
 * Created by JIN on 2019/5/22.
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不正确"),
    PRODUCT_STOCK_SUCCESS(12,"商品库存正确"),
    ORDER_NOT_EXIT(13,"订单不存在"),
    ORDERDETAIL_NOT_EXIT(14,"订单详细不存在"),

    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
