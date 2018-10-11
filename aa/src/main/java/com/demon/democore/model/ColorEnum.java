package com.demon.democore.model;

/**
 * @program:
 * @Author: Zhang Qiang
 * @Date: 2018/9/30 20:38
 * @Description:
 */
public enum  ColorEnum{

    //RED,GREEN,ORANGE,BLUE,BLACK,WHITE,PINK,BROWN,YELLOW;

    RED("red","红色"),GREEN("green","绿色"),ORANGE("orange","橙色"),BLUE("blue","蓝色"),BLACK("black","黑色"),WHITE("white","白色"),PINK("pink","粉色"),BROWN("brown","棕色"),YELLOW("yellow","黄色");

    private final String key;

    private final String value;

    ColorEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static ColorEnum getEnumByKey(String key){
        if (null == key){
            return null;
        }
        for (ColorEnum color : ColorEnum.values()){
            if (color.getKey().equals(key)){
                return color;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
