package com.xkj.repository;

import com.xkj.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JIN on 2019/5/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456788");
        orderDetail.setOrderId("11111");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("111111111");
        orderDetail.setProductName("烤肉饭");
        orderDetail.setProductPrice(new BigDecimal(15.5));
        orderDetail.setProductQuantity(2);

        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> byOrderId = orderDetailRepository.findByOrderId("11111");
        Assert.assertNotEquals(0,byOrderId.size());
    }

}