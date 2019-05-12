package com.xkj.service.impl;

import com.xkj.entity.ProductInfo;
import com.xkj.enums.ProductStatusEnum;
import com.xkj.repository.ProductInfoRepository;
import com.xkj.service.ProductInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JIN on 2019/4/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productInfoService.findOne("123456");
        Assert.assertNotEquals(0,productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> proList = productInfoService.findUpAll();
        Assert.assertNotEquals(0,proList.size());

    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> proAllList = productInfoService.findAll(pageRequest);
        System.out.println(proAllList.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("烤肉饭");
        productInfo.setProductPrice(new BigDecimal(15.9));
        productInfo.setProductStock(5);
        productInfo.setProductDescription("烤肉饭卤蛋");
        productInfo.setProductIcon("http://***.jpg");
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setCategoryType(1);

        ProductInfo productInfoRes = productInfoService.save(productInfo);
        Assert.assertNotNull(productInfoRes);
    }

}