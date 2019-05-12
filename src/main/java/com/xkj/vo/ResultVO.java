package com.xkj.vo;

import lombok.Data;

/**
 * Http请求返回的对象
 * Created by JIN on 2019/4/2.
 */
@Data
public class ResultVO<T> {

    /**错误码**/
    private Integer code;

    /**提示信息**/
    private String msg;

    /**内容**/
    private  T data;
}
