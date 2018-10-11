package com.demon.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SoryUtils {

    public static void main(String[] args) {

        int array[] = {11,2,1,90,-31,3,834,0,8,9,10,235,77,36,-8};

        //冒泡排序
        //bubbleSort(array);
        //选择排序
        //selectSort(array);
        //插入排序
        //insertionSort(array);
        //for (int i=0;i<array.length;i++)System.out.println(array[i]);

        //judgePrimeNumber(1,15);

        primCount(10);

    }

    /**
     *冒泡排序
     *比较相邻的两个元素，如果第一个比第二个大则将两个交换顺序
     *i<numbers.length 控制排序轮数 一般为数组长度减1次，因为最后一次循环只剩下一个数组元素，不需要对比，同时数组已经完成排序了
     *j<numbers.length-i  因为经过一个排序后，最大（或最小）的元素都已经放到了数组的最后一位，下次不用再进行比较。所以长度改变
     */
    public static void bubbleSort(int[] numbers){
        int temp;
        for(int i=1;i<numbers.length;i++){
            for (int j = 0;j < numbers.length-i;j++){
                if (numbers[j] > numbers[j+1]){
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * 由于交换位置放在了第一层循环里面，所以速度会比冒泡（放在了第二层循环中）快
     *
     *
     * 特点：效率低，容易实现。
     * 思想：每一趟从待排序序列选择一个最小的元素放到已排好序序列的末尾，剩下的为待排序序列，重复上述步骤直到完成排序。
     *
     */

    public static void selectSort(int numbers[]){

        int temp;
        for(int i = 0; i<numbers.length - 1;i++){
            int index = i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[index]>numbers[j]){
                    index=j;
                }
            }
            //找到了比array[i]小的则与array[i]交换位置
            if(index!=i){
                temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
        }
    }
    /**
     * 插入排序
     * 特点：效率低，容易实现。
     * 思想：将数组分为两部分，将后部分元素逐一与前部分元素比较，如果前部分元素比array[i]小，就将前部分元素往后移动。当没有比array[i]小的元素，即是合理位置，在此位置插入array[i]
     * */
    public static void insertionSort(int numbers[]) {
        int i, j, t;
        for (i = 1; i < numbers.length; i++) {
            t = numbers[i];
            for (j = i - 1; j >= 0 && t < numbers[j]; j--)
                numbers[j + 1] = numbers[j];
            //插入array[i]
            numbers[j + 1] = t;
        }
    }


    /**
     * 判断素数（质数）个数并输出 素数：除了1和它本身以外不再有其他因数
     * 质数又称素数。一个大于1的自然数，除了1和它自身外，不能整除其他自然数的数叫做质数；否则称为合数
     * 两次循环
     * 第一次循环是n到m，取每个数
     * 第二个循环是判断这个数是不是素数
     */
    public static void judgePrimeNumber(int N , int M) {
        int temp = 0;
        List list = new LinkedList();
        for (int i=N;i<M;i++){
            boolean flag = true ;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                list.add(i);
                temp++;
            }
        }
        System.out.println("素数："+temp+"个:"+list);

    }


    /**
     * 求该数是多少对质数相加的和
     * 先得到小于输入整数的所有质数，并且存入list集合中
     * 遍历list集合，寻找是否存在两两组合的机会。
     * 输出结果（注意特殊情况的处理）
     *
     */

    public static void primCount(int num){

        List<Integer> list = new LinkedList<Integer>();
        List<Integer> lista = new ArrayList<Integer>();

        for (int i=1;i<num;i++){
            boolean flag = true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag)list.add(i);
        }
        System.out.println("所有的质数："+list);
        int count = 0;
        for (int i=0;i<list.size();i++){
            //contains包含，获取到包含符合条件的质数
            if (list.contains(num - list.get(i))){
                count++;
            }
        }
        if(num%2==0 && list.contains(num / 2))
            System.out.println("一共有：" + (count / 2 + 1) + "组质数");
        else
            System.out.println("一共有：" + (count /2) + "组质数");

    }







}
