package com.xkj.repository;

import com.xkj.entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created by JIN on 2019/5/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository orderMasterRepository;


    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("小先肉");
        orderMaster.setBuyerPhone("11111111111");
        orderMaster.setBuyerAddress("1栋1单元");
        orderMaster.setBuyerOpenid("00124");
        orderMaster.setOrderAmount(new BigDecimal(1.5));

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 1);
        Page<OrderMaster> result = orderMasterRepository.findByBuyerOpenid("00124", pageRequest);
        Assert.assertNotEquals(0, result.getTotalElements());
    }

}