package com.xkj.enums;

import lombok.Getter;

/**
 * Created by JIN on 2019/5/22.
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不正确"),
    PRODUCT_STOCK_SUCCESS(11,"商品库存正确"),

    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
