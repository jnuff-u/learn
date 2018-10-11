package com.demon.democlass.action;

import com.demon.democore.user.User;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @program:
 * @Author: Zhang Qiang
 * @Date: 2018/9/27 16:48
 * @Description:
 */
public class Action {

    public static void main(String[] args) {

        User user = new User();

        Class userClass = user.getClass();
        System.out.println("userClass.getName() : " + userClass.getName());



        Class userClass1 = User.class;
        System.out.println("userClass1==userClass : " + (userClass1==userClass));


        try {
            Class userClass2 = Class.forName("com.demon.democore.user.User");
            System.out.println("userClass1==userClass2 : " + (userClass1==userClass2));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void getFields(){

        try {

            Class userClass = Class.forName("com.demon.democore.user.User");

            System.out.println("className : " + userClass.getName());
            //获取公共对象
            //Field[] fields = userClass.getFields();
            //获取私有化对象
            Field[] fields = userClass.getDeclaredFields();

            for (Field field : fields){
                System.out.println(field);
            }


            //获取对象
            Object obj = userClass.getConstructor().newInstance();

            //获取属性
            Field f = userClass.getDeclaredField("name");

            System.out.println("f : "+f);
            //强制设置 通过GetDeclaredConstructor获取的私有构造进行暴力访问，打开权限为[true].
            f.setAccessible(true);
            f.set(obj,"人名");

            User user = (User) obj;
            System.out.println("user : " + user.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


//    public void testClass(){
//
//        //1.获取Class对象
//        Class stuClass = Class.forName("fanshe.method.Student");
//        //2.获取所有公有方法
//        System.out.println("***************获取所有的”公有“方法*******************");
//        stuClass.getMethods();
//        Method[] methodArray = stuClass.getMethods();
//        for(Method m : methodArray){
//            System.out.println(m);
//        }
//        System.out.println("***************获取所有的方法，包括私有的*******************");
//        methodArray = stuClass.getDeclaredMethods();
//        for(Method m : methodArray){
//            System.out.println(m);
//        }
//        System.out.println("***************获取公有的show1()方法*******************");
//        Method m = stuClass.getMethod("show1", String.class);
//        System.out.println(m);
//        //实例化一个Student对象
//        Object obj = stuClass.getConstructor().newInstance();
//        m.invoke(obj, "刘德华");
//        System.out.println("***************获取私有的show4()方法******************");
//        m = stuClass.getDeclaredMethod("show4", int.class);
//        System.out.println(m);
//        m.setAccessible(true);//解除私有限定
//        Object result = m.invoke(obj, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
//        System.out.println("返回值：" + result);
//    }


}
