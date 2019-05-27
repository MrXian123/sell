package com.xkj.dto;

import lombok.Data;

/**
 * 购物车
 * Created by JIN on 2019/5/27.
 */
@Data
public class CartDTO {

    /** 商品Id */
    private String productId;

    /** 数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
