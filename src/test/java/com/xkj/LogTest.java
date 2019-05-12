package com.xkj;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by JIN on 2019/3/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {

    @Test
    public void LogTests(){
        log.info("我是Info");
        log.info("我是Info");
        log.info("我是Info");
        log.error("我是error");
        log.debug("我是debug");
        log.info("哈哈哈");
    }

}
