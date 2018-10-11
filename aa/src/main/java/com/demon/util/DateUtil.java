package com.demon.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @program:
 * @Author: Zhang Qiang
 * @Date: 2018/9/27 15:57
 * @Description:
 */
public class DateUtil {


    /**
     * @param: [date, formatType]
     * @return: java.lang.String
     * @auther: Zhang Qiang
     * @date: 2018/9/27 15:58
     * @info: date 转换为 String类型 format 自定义 默认 "yyyy-MM-dd hh:mm:ss"
     *
     */
    public static String formatDateToString(java.sql.Date date, String formatType) {

        if (formatType==null) formatType = "yyyy-MM-dd hh:mm:ss";

        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(formatType);
        String s = "";
        if (date != null) {
            s = format.format(date);
        }
        return s;
    }
    /**
     * @param: [mss]
     * @return: java.lang.String
     * @auther: Zhang Qiang
     * @date: 2018/9/27 16:00
     * @info: 转换毫秒为时长
     *
     */
    public static String formatMSToTime(long mss) throws InterruptedException {


        long days = mss / (1000 * 60 * 60 * 24);
        long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);
        long seconds = (mss % (1000 * 60)) / 1000;

        String time = "";
        if(days != 0){
            time += days+"天";
        }
        if(hours != 0){
            time += hours+"小时";
        }
        if(minutes != 0){
            time += minutes+"分钟";
        }
        if(seconds != 0){
            time += seconds+"秒\n";
        }
        if(days == 0 & hours == 0 &minutes == 0 & seconds == 0){
            time += String.valueOf(mss) + "毫秒";
        }
        return time;
    }

    /**
     * @param: [mss]
     * @return: java.lang.String
     * @auther: Zhang Qiang
     * @date: 2018/9/27 16:10
     * @info: 转毫秒为日期
     *
     */
    public static String formatMSToDate(long mss){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(mss);
    }


    /**
     * @param: [type, t]
     * @return: void
     * @auther: Zhang Qiang
     * @date: 2018/9/27 16:33
     * @info: 休眠
     *
     */
    public static void sleep(String type,Integer t) throws InterruptedException {

        if (t==0) t=1 ;

        switch (type){
            case "d":
                TimeUnit.DAYS.sleep(t);//天
                break;
            case "h":
                TimeUnit.HOURS.sleep(t);//小时
                break;
            case "M":
                TimeUnit.MINUTES.sleep(t);//分
                break;
            case "s":
                TimeUnit.SECONDS.sleep(t);//秒
                break;
            case "m":
                TimeUnit.MILLISECONDS.sleep(t*1000);//毫秒
                break;
            case "mic":
                TimeUnit.MICROSECONDS.sleep(t*1000);//微妙
                break;
            case "n":
                TimeUnit.NANOSECONDS.sleep(t*1000);//纳秒
                break;
        }

    }


    /**
     * @param: []
     * @return: void
     * @auther: Zhang Qiang
     * @date: 2018/9/27 16:06
     * @info: 时间测试
     *
     */
    public void testDate() throws InterruptedException {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        long start = System.currentTimeMillis();

        Calendar calendar = Calendar.getInstance();
        //获取系统当前年份
        int year=calendar.get(Calendar.YEAR);
        //获取系统当前月份
        int month = calendar.get(Calendar.MONTH) + 1;
        //获取系统当然日期
        int day = calendar.get(Calendar.DATE);
        //获取系统当前小时
        int hour = calendar.get(Calendar.HOUR);
        //获取系统当然分钟
        int minute = calendar.get(Calendar.MINUTE);
        //获取系统当前秒数
        int second = calendar.get(Calendar.SECOND);

//        获取毫秒数的时间戳 13位
        System.out.print("\n" + date.getTime() + "\n");
//        获取当前时间
        System.out.print("\n" + df.format(date) + "\n");
//        转化时间戳
        System.out.print("\n" + df.format(date.getTime()) + "\n");

        Date now = new Date();
        long strNow = now.getTime();
        long strSystem =  System.currentTimeMillis();
        SimpleDateFormat stm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.print(strNow + "\n");
        System.out.print(strSystem + "\n");

        String str1 = stm.format(now);
        String str2 = stm.format(strNow);

        System.out.print( now + "\n");
        System.out.print( str1 + "\n");
        System.out.print( str2 + "\n");

        long end = System.currentTimeMillis();
        long time = (end-start);
        System.out.println("\n程序运行时间： "+ formatMSToTime(time) + "\n");

    }

}
