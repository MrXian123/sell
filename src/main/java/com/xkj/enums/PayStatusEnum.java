package com.xkj.enums;

import lombok.Getter;

/**
 * 支付状态枚举
 * Created by JIN on 2019/5/9.
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
