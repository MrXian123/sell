package com.xkj.service;

import com.xkj.entity.ProductCategory;

import java.util.List;

/**类目service
 * Created by JIN on 2019/3/31.
 */
public interface CategoryService {
    /**
     * 根据id查询类目
     * @param categroyId
     * @return
     */
    ProductCategory findOne(Integer categroyId);

    /**
     * 查询所有类目
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 根据多个类型查询
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 保存类目
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
