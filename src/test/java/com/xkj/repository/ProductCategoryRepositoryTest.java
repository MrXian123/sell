package com.xkj.repository;

import com.xkj.entity.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by JIN on 2019/3/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = productCategoryRepository.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("哈哈哈我最帅", 3);
        ProductCategory save = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(save);
    }

    @Test
    public  void findByCategoryTypeIn(){
        List<Integer> ctlist = Arrays.asList(1, 2, 3);
        List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(ctlist);
        log.info("*********"+String.valueOf(byCategoryTypeIn.size()));
        Assert.assertNotEquals(0,byCategoryTypeIn.size());

    }


}