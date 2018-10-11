package com.demon.demolist.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapClass {


    public static void main(String[] args) {

        Map<String,Object> map = new HashMap();

        map.put("老一","王西(๑ŐдŐ)b");
        map.put("老二","王笑");
        map.put("老三","王厉");
        map.put("老四","王勿桥");
        System.out.println("===========遍历Map===========");

        one(map);

        System.out.println("======================");

        two(map);

        twoT(map);

        System.out.println("======================");

        three(map);

        System.out.println("======================");

        four(map);
    }

    public static void one(Map<String,Object> map){

        System.out.println("通过Map.keySet遍历key和value：");

        //通过foreach方法来遍历
        for (String key : map.keySet()) {

            System.out.println("key= "+ key + " and value= " + map.get(key));
        }
    }

    public static void two(Map<String,Object> map){

        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        //通过构造操作符来遍历（Iterator迭代器，游标（Cursor）模式）
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Object> entry = it.next();

            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }

    public static void twoT(Map<String,Object> map){

        System.out.println("通过Map.keySet使用iterator遍历key和value：");

        //通过构造操作符来遍历（Iterator迭代器，游标（Cursor）模式）
        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {

            String key = iterator.next();

            System.out.println("key= " + key + " and value= " + map.get(key));
        }
    }


    public static void three(Map<String,Object> map){
        //foreach方法
        System.out.println("通过Map.entrySet遍历key和value");

        for (Map.Entry<String, Object> entry : map.entrySet()) {

            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }

    public static void four(Map<String,Object> map){

        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");

        for (Object v : map.values()) {

            System.out.println("value= " + v);
        }
    }



}
