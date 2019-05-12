package com.xkj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by JIN on 2019/4/1.
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    //商品名字
    private String productName;

    //单价
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //商品描述
    private String productDescription;

    //商品图标
    private String productIcon;

    //状态   上架/下架
    private Integer productStatus;

    //商品类目编号
    private Integer categoryType;

}
