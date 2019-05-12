package com.xkj.repository;

import com.xkj.entity.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


/**
 * Created by JIN on 2019/4/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoRepositoryTest {

    @Autowired
    private  ProductInfoRepository productInfoRepository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("卤肉饭");
        productInfo.setProductPrice(new BigDecimal(15.9));
        productInfo.setProductStock(5);
        productInfo.setProductDescription("卤肉饭卤蛋");
        productInfo.setProductIcon("http://***.jpg");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(1);

        ProductInfo productInfoRes1 = productInfoRepository.save(productInfo);
        Assert.assertNotNull(productInfoRes1);
    }
    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productList = productInfoRepository.findByProductStatus(1);
        Assert.assertNotEquals(0,productList.size());
        log.info(productList.get(0).toString());
     }
}