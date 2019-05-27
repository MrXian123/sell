package com.xkj.util;

import java.util.Random;

/**
 * 主键生成工具类
 * Created by JIN on 2019/5/23.
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
