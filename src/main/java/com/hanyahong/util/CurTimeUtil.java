/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间与其他时间的差
 * Created by yx on 2016/12/8.
 */
public class CurTimeUtil {

    /**
     * 比较两个时间相差天数
     *
     * @param oldTime 时间
     * @return
     */
    public static Long getIntervalDays(String oldTime) {
        Long intervalMilli = null;
        try {
            String currentTime = DateUtil.getCurrentTimeAspageber();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");

            Date currentDate = simpleDateFormat.parse(currentTime);
            Date oldDate = simpleDateFormat.parse(oldTime);

            intervalMilli = currentDate.getTime() - oldDate.getTime();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return (intervalMilli / (24 * 60 * 60 * 1000));

    }


    //计算两个时间相差多少分钟
    public static int getIntervalmin(String time) {
        Long intervalMilli = null;
        try {
            String s = DateUtil.getCurrentTimeAspageber();
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
            Date date1 = simpleDateFormat1.parse(s);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
            Date date = simpleDateFormat.parse(time);
            intervalMilli = date1.getTime() - date.getTime();
            //System.out.print((int) (intervalMilli / ( 60 * 1000)));
        } catch (Exception e) {

        }
        return (int) (intervalMilli / (60 * 1000));

    }


    /**
     * 相对2000年的时间戳
     *
     * @return
     */
    public static Long getTimeKeys() {
        Long intervalMilli = null;
        String oidTime = "2000/01/01/00:00:00";
        return getIntervalDays(oidTime);
    }


}
