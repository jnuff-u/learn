package com.demon.demolist.collection;

import java.util.*;

public class SetClass {


    public static void main(String[] args) {

        Set tSet = new TreeSet<Integer>();

        tSet.add(1);
        tSet.add(-99);
        tSet.add(-98);
        tSet.add(68);
        tSet.add(69);
        tSet.add(70);
        tSet.add(-70);
        tSet.add(-70);
        tSet.add(-71);
        tSet.add(0);

        System.out.println(tSet);


        Map tMap = new TreeMap();
        tMap.put(1,89);
        tMap.put(6,99);
        tMap.put(6,59);
        tMap.put(9,99);
        tMap.put(2,99);
        tMap.put(0,124124);
        tMap.put(-66,3.14);
        tMap.put(-91236,3.14159265);
        System.out.println(tMap);



        Map sMap = new TreeMap();

        List list = new LinkedList();
        list.add(1);
        list.add(55);
        list.add(58);
        list.add(90);
        list.add(9250);
        list.add(-1120);
        list.add(-20);

        sMap.put("i9o",list);
        sMap.put("io",list);
        sMap.put("i94",list);
        sMap.put("oIga",list);
        sMap.put("p02",list);

        System.out.println(sMap);




    }
}
