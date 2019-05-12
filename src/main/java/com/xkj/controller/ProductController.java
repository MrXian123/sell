package com.xkj.controller;

import com.xkj.entity.ProductCategory;
import com.xkj.entity.ProductInfo;
import com.xkj.service.CategoryService;
import com.xkj.service.ProductInfoService;
import com.xkj.util.ResultVoUtil;
import com.xkj.vo.CategoryProductVO;
import com.xkj.vo.ProductInfoVO;
import com.xkj.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品controller
 * Created by JIN on 2019/4/2.
 */
@RestController
@RequestMapping("/buyer/product")
public class ProductController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/list")
    public ResultVO list() {

        //查询所有上架的商品
        List<ProductInfo> productInfos = productInfoService.findUpAll();

//        for (ProductInfo productInfo : productInfos) {
//            productCategoryList.add(productInfo.getCategoryType());
//        }
        //使用java8 获取商品中的类目
        List<Integer> productCategoryTypeList = productInfos.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());

        List<ProductCategory> proCategoryList = categoryService.findByCategoryTypeIn(productCategoryTypeList);

        List<CategoryProductVO> categoryProductVos = new ArrayList<>();
        for (ProductCategory productCategory : proCategoryList) {
            CategoryProductVO categoryProductVO = new CategoryProductVO();
            categoryProductVO.setCategoryName(productCategory.getCategoryName());
            categoryProductVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVos = new ArrayList<>();
            for (ProductInfo productInfo : productInfos) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVos.add(productInfoVO);
                }
            }
            categoryProductVO.setProductInfoVOList(productInfoVos);
            categoryProductVos.add(categoryProductVO);
        }

        return ResultVoUtil.success(categoryProductVos);
    }
}
