package com.xkj.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 商品类目
 * Created by JIN on 2019/3/24.
 */
@Entity
@DynamicUpdate
@Data
public class  ProductCategory {

    //类目id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer categoryId;

    //类目名字
    private String  categoryName;

    //类目编号
    private Integer  categoryType;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    public ProductCategory() {
    }
    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }


}
