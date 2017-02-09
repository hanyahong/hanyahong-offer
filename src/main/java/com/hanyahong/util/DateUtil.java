/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.util;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {
    public static String getCurrentTime() {
        String returnStr = null;
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        returnStr = f.format(date);
        return returnStr;
    }

    public static String getCurrentTime2() {
        String returnStr = null;
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        returnStr = f.format(date);
        return returnStr;
    }

    /**
     * 时间戳，日期格式按照ISO8601标准表示，并需要使用UTC时间
     *
     * @return
     */
    public static String getCurrentTimeUTC() {
        String returnStr = null;
        Date date = new Date();

        return date.toString();
    }

    public static String getCurrentTimeAspageber() {
        String returnStr = null;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        Date date = new Date();
        returnStr = f.format(date);
        return returnStr;
    }

    /**
     * 返回字符串类型时间（ISO8601标准时间）
     *
     * @return
     */
    public static String getISO8601Timestamp() {
        Date date = new Date();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(tz);
        String nowAsISO = df.format(date);
        return nowAsISO;
    }

    public static String getCurDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd ");
        String strDate = simpledateformat.format(calendar.getTime());
        return strDate;
    }

    public static String getCurDate3() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy'年'MM'月'dd'日' ");
        String strDate = simpledateformat.format(calendar.getTime());
        return strDate;
    }

    public static String getCurDate(String format) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpledateformat = new SimpleDateFormat(format);
        String strDate = simpledateformat.format(calendar.getTime());
        return strDate;
    }

    public static Date stringToDate(String strDate, String srcDateFormat,
                                    String dstDateFormat) {
        Date rtDate = null;
        Date tmpDate = new SimpleDateFormat(srcDateFormat).parse(strDate,
                new ParsePosition(0));

        String tmpString = null;
        if (tmpDate != null)
            tmpString = new SimpleDateFormat(dstDateFormat).format(tmpDate);
        if (tmpString != null) {
            rtDate = new SimpleDateFormat(dstDateFormat).parse(tmpString,
                    new ParsePosition(0));
        }
        return rtDate;
    }


}
