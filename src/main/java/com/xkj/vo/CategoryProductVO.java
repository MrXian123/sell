package com.xkj.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品类目
 * Created by JIN on 2019/4/2.
 */
@Data
public class CategoryProductVO {

    /**类目名称*/
    @JsonProperty("name")
    private String categoryName;

    /**类目标识**/
    @JsonProperty("type")
    private Integer categoryType;

    /**对应的商品*/
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
