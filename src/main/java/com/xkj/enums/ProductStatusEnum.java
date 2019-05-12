package com.xkj.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by JIN on 2019/4/2.
 */
@Getter
public enum ProductStatusEnum {

    UP(1,"已上架"),
    DOWN(0,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
