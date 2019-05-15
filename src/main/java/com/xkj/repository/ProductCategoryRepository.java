package com.xkj.repository;

import com.xkj.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品类目dao
 * Created by JIN on 2019/3/25.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

    //根据类目查下
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
