package com.demon.demolist.collection;

import com.demon.democore.user.User;

import java.util.*;

public class LinkedClass {


    public static void main(String[] args) {
        User user = new User();

        //实例化对象
        LinkedList<User> link = new LinkedList();

        //先加入的在最后 后添加的在集合的最前面 执行增加操作的时候才会增加空间
        link.add(new User("黄牛"));
        link.add(new User("黑虎"));
        link.add(new User("银蛇"));
        link.add(new User("绿羊"));
        link.add(new User("金鸡"));
        link.add(new User("赤犬"));
        link.add(new User("宝马"));
        link.add(new User("白猪"));
        link.add(new User("灵鼠"));
        link.add(new User("蓝龙"));
        link.add(new User("月兔"));
        link.add(new User("巨猿"));

        link.addFirst(new User("我是第一个"));
        link.addLast(new User("我在最后"));

        //根据索引添加指定位置
        link.add(13,new User("我是十三"));

        //取出第一个
        System.out.println("第一个："+link.getFirst().getName());

        //取出最后一个
        System.out.println("最后一个：" + link.getLast().getName());

        //根据位置取值
        System.out.println(link.get(1).getName());

        //删除
//        link.removeLast();
        link.remove(0);


        //forLinkedList(link);
        //forQueue();


        addTest();

    }

    public static void forLinkedList(LinkedList<User> linkedList){

        System.out.println("linkedList.get(i)循环");
        int size = linkedList.size();
        for (int i=0; i<size; i++) {
            System.out.println(linkedList.get(i).getName());
        }


        System.out.println("pollFirst循环");
        //pollFirst获取第一个实例
        while(linkedList.pollFirst() != null){
            linkedList.pollFirst().getName();
        }


        System.out.println("removeFirst循环");

        try {
            while(linkedList.removeFirst() != null)
                System.out.println(linkedList.removeFirst().getName());;
        } catch (NoSuchElementException e) {
        }

        System.out.println("removeLast循环");

        try {
            while(linkedList.removeLast() != null)
                System.out.println(linkedList.removeLast().getName());;
        } catch (NoSuchElementException e) {
        }


    }



    public static void forQueue(){
        //Queue 队列 先进先出
//        Queue<User> queue = new ArrayDeque<User>();
        Queue<User> queue = new LinkedList<User>();

        queue.offer(new User("黄牛"));
        queue.offer(new User("黑虎"));
        queue.offer(new User("银蛇"));
        queue.offer(new User("绿羊"));
        queue.offer(new User("金鸡"));

        System.out.println(queue);

        //按照顺序取第一个（取出来然后放回去）
        System.out.println(queue.peek().getName());

        //按照顺序取第一个（取出来的同时移除，也就是不放进去了）
        System.out.println(queue.poll().getName());

        //按照顺序取第一个（取出来然后放回去）
        System.out.println(queue.peek().getName());

    }


    public static void forLink(){

        LinkedList<User> linkedlist = new LinkedList<User>();
        linkedlist.add(new User("黄牛"));
        linkedlist.add(new User("黑虎"));
        linkedlist.add(new User("银蛇"));
        linkedlist.add(new User("绿羊"));
        linkedlist.add(new User("金鸡"));

        System.out.println(linkedlist.getFirst().getName());

        for(Object o:linkedlist){
            System.out.println(o.toString());
        }

    }




    public static void addTest(){

        //批量插入，每次都向首位插入数据；

        LinkedList linkedList = new LinkedList();

        long time1 = new Date().getTime();

        for(int m=0;m<300000;m++){
            linkedList.add(0,null);
        }

        long time2 = new Date().getTime();

        System.out.print("linkedList批量插入时间:"+(time2 - time1)+"ms\n");




        ArrayList arraylist = new ArrayList();

        long time3 = new Date().getTime();

        for(int n=0;n<300000;n++){
            arraylist.add(0, null);
        }

        long time4 = new Date().getTime();
        System.out.print("arrayList批量插入时间:"+(time4 - time3)+"ms\n");

    }







}
