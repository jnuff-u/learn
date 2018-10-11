package com.demon.demolist.collection;

import com.demon.democore.user.User;
import org.junit.Test;

import java.util.*;

public class HashMapClass {



    @Test
    public void forHashMap() {

        Map map = new  HashMap();

        User user1 = new User("老张");

        map.put(1,user1);

        System.out.println(map.get(1));



    }


    public void forLinkedHashMap(){
        Map map = new LinkedHashMap();
    }


    public static void main(String[] args) {
        System.out.println(" run ");
    }

    public static class ArrayListClass {
        public static void main(String[] args) {




            String[] strings = {"a","b","c","d"};

            //把list绑定到strings上面
            List<String> list = Arrays.asList(strings);

            System.out.println(list);

            strings[0] = "bb";

            System.out.println(list);

            list.set(0,"aoc");

            for (String a :strings){
                System.out.println(a);
            }



        }
    }
}
