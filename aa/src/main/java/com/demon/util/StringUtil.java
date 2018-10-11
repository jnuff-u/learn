package com.demon.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program:
 * @Author: Zhang Qiang
 * @Date: 2018/9/27 15:36
 * @Description:
 */
public class StringUtil {


    public static void main(String[] args) throws IOException {
//        String filedString = "";
//        readTxt("D:\\IdeaProjects\\task1\\aa\\src\\main\\resources\\randomPro.txt");

        String str = "common\nservicen\ncontroller\nbusiness\ncore\nutil";
        String spi = "\n";
        List list = readString(str,spi);

        System.out.println(list.get(3));

    }



    /**
     * @param: [fields, name]
     * @return: int
     * @auther: Zhang Qiang
     * @date: 2018/9/27 15:49
     * @info: 查找指定的信息
     *
     */
    public static int getIndex(String[] fields, String name) {

        if ((fields == null) || (name == null)) { return -1; }
        for (int i = 0; i < fields.length; i++) {
            if (name.equalsIgnoreCase(fields[i])) { return i; }
        }
        return -1;
    }


    /**
     * @param: []
     * @return: java.lang.StringBuilder
     * @auther: Zhang Qiang
     * @date: 2018/9/27 16:35
     * @info: 姓名
     *
     */
    protected StringBuilder getNameBuilder(){


        StringBuilder nameBuilder = new StringBuilder();

        String[] strN = new String[]{
                "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "诸葛", "公孙",
                "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "欧阳", "乌良",
                "朱", "秦", "尤", "许", "何", "吕", "施", "张", "夏侯", "东郭",
                "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "乌苏", "令狐",
                "戚", "谢", "邹", "喻", "柏", "水", "窦", "章", "司马", "赫连",
                "云", "苏", "潘", "葛", "奚", "范", "彭", "郎", "拓跋", "乐正",
                "廉颇", "颇呵", "欧冠", "谷歌", "皇", "西", "卡卡", "吃", "过", "分",
                "鲁", "韦", "昌", "马", "苗", "凤", "花", "方"};

        String[] strM = {
                "辰彬","运皓","骞腾","晨轩","侠宇","振震","骞晨","运骏","澄运","轩龙","逸辰","嘉","强",
                "盛凡","晨骏","柏成","凯骞","文邦","骞逸","梓然","鸿仕","树","翰","梁","允轩","炳家",
                "振家","辞","晨骞","良骏","骏晨","嘉中","畅胤","德稷","星运","潍","运帆","泽","辰",
                "铭","福","辞桀","材泽","华","华文","振良","祯逸","驰初","凯星","谷轩","辰嘉","震",
                "振坤","康骞","嘉","振","骏","爵斌","然允","嘉驰","勇骞","文骏","轩","骞梓","嘉俊",
                "运海","峰振","骏","良","家梓","加晨","权祜","阳","星轩","鸿锐","沛骞","畅","仕延",
                "暄","震家","郁辰","辰树","运奇","辰帝","杰运","成涛","博胤","信","初尧","良林",
                "高晨","命","北家","松木","醒","牙","利","峰峰","梁木","好好","球球","门伏","神漾",
                "嘉浩","哲权","腾骞","锋福","裕裕","天勇","鹤","运然","钊浩","球","门","漾",
                "暄","震家","郁辰","辰树","运奇","辰帝","杰运","成涛","博胤","信","初尧","良林",
                "高晨","命","北家","松木","醒","牙","利","峰峰","梁木","好好","球球","门伏","神漾",
                "东","西","南","北","琛","齐","刚","宝","木","火","土","昌","莽","僧佑",
                "楚","燕","韩","赵","魏","秦","曦","熹","松","熠","申","蚀","猛","胜",
                "昙","士","将","鬼","尽","乐","月","阳","阴","文","峰","锋","龙","马","虎",
                "禹","汤","舜","病","年","尧","生","梵童","诃","泠","恺之","之","思潮","霸",
                "安","康","泰","全","男","山","某","某某","基","发","鱻","耳","纯","璞玉",
                "魄","英","鸥鸟","瀚海","荷","枫枫","男","东","西政","欧派","佛山","让","关",
                "高","路","南","宿也","吉利","烈焰","冰山","恴熙","淼","不还","影","伏","凼"
                };

        nameBuilder.delete(0,999);
        nameBuilder.append(strN[(int)(Math.random()* strN.length)]);
        nameBuilder.append(strM[(int)(Math.random()* strN.length)]);

        return nameBuilder;
    }

    /**
     * @param: []
     * @return: java.util.List
     * @auther: Zhang Qiang
     * @date: 2018/9/30 17:25
     * @info: 读取txt文件
     *
     */
    public static List readTxt(String filedString) throws IOException {

        List proList = new ArrayList();

//        if (filedString == null)
//            filedString = "D:\\IdeaProjects\\task1\\aa\\src\\main\\resources\\randomPro.txt";

        FileReader fileReader = new FileReader(filedString);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String s = null;

        int a = 0;

        while ((s = bufferedReader.readLine())!=null){
            proList.add(s);
            a ++;
            System.out.println("第 " + a + "行");
            System.out.println(s);
        }

        System.out.println("proList size is :" + proList.size());
        return proList;
    }

    /**
     * @param: [s, split]
     * @return: java.util.List
     * @auther: Zhang Qiang
     * @date: 2018/9/30 19:33
     * @info: 分割字符串为list s=字符串 split=分隔符
     *
     */
    public static List readString(String s,String split){

        // \n 换行  \r 回车 \d

        String arr[] = s.split(split);

        List strList = Arrays.asList(arr);

        System.out.println(strList.toString());

        return strList;
    }


}
