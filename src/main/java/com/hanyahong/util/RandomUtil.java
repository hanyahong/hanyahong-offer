/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ID生成器工具类
 *
 * @author hyh
 */
public class RandomUtil {
    /**
     * 随机生成文件信息
     *
     * @return 时间戳+随机数
     */
    public static String getRandomFileName() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssss");
        Date date = new Date();
        String str = simpleDateFormat.format(date) + createRandomVcode();
        return str;
    }

    /**
     * 创建随机验证码
     *
     * @return 随机数
     */
    public static String createRandomVcode() {
        String vcode = "";
        for (int i = 0; i < 6; i++) {
            vcode = vcode + (int) (Math.random() * 9.0D);
        }
        return vcode;
    }

    /**
     * 创建随机n位字母
     *
     * @return 随机数
     */
    public static String createRandomVcode2(int num) {
        String vcode = "";
        for (int i = 0; i < num; i++) {
            //52个字母与6个大小写字母间的符号；范围为91~96
            int value = (int) (Math.random() * 58 + 65);
            while (value >= 91 && value <= 96)
                value = (int) (Math.random() * 58 + 65);
            vcode = vcode + (char) value;

        }
        return vcode;
    }

    /**
     * 随机生成随机用户名
     *
     * @return 时间戳+随机数
     */
    public static String getRandomUserName() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ssss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMdd");
        Date date = new Date();
        String str = simpleDateFormat.format(date) + createRandomVcode2(2) + simpleDateFormat2.format(date) + createRandomVcode2(2);
        return str;
    }

    /**
     * 随机生成token值
     *
     * @return 时间戳+随机数
     */
    public static String getRandomToken() throws Exception {

        return KeyDigestUtil.hmacSHA1AndBase64(createRandomVcode2(8), getRandomFileName());
    }
}
