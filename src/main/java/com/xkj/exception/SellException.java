package com.xkj.exception;

import com.xkj.enums.ResultEnum;

/**
 * Created by JIN on 2019/5/21.
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException( Integer code,String message) {
        super(message);
        this.code = code;
    }
}
