package com.demon.democore.action;

import com.demon.democore.model.Avalue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationcontext.xml")
public class Sort {

    @Autowired
    private Avalue avalue;

    public static void main(String[] args) {

        int[] as = {10,22,23,94,25,78,0,-2,-98,0};

        bubbleSort(as);

        for (int a : as){
            System.out.println(a);
        }





    }

    @Test
    public void test(){

        System.out.println(avalue.getUserUrl());
    }


    /**
     * 冒泡排序
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     * @param numbers 需要排序的整型数组
     */
    public static void bubbleSort(int[] numbers){
        int temp = 0;
        int size = numbers.length;
        for(int i = 0 ; i < size-1; i ++)
        {
            for(int j = 0 ;j < size-1-i ; j++)
            {
                if(numbers[j] > numbers[j+1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }


    /**
     *
     * 选择排序
     * 特点：效率低，容易实现。
     * 思想：每一趟从待排序序列选择一个最小的元素放到已排好序序列的末尾，剩下的为待排序序列，重复上述步骤直到完成排序。
     *
     */
    public static void selectSort(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++){
            int index=i;
            for (int j = i + 1; j < array.length; j++)
                if (array[index] > array[j])
                    index=j;
            if(index!=i){ //找到了比array[i]小的则与array[i]交换位置
                t = array[i];
                array[i] = array[index];
                array[index] = t;
            }
        }
    }



    /**
     * 插入排序
     * 特点：效率低，容易实现。
     * 思想：将数组分为两部分，将后部分元素逐一与前部分元素比较，如果前部分元素比array[i]小，就将前部分元素往后移动。当没有比array[i]小的元素，即是合理位置，在此位置插入array[i]
     * */
    public static void insertionSort(int array[]) {
        int i, j, t = 0;
        for (i = 1; i < array.length; i++) {
            t = array[i];
            for (j = i - 1; j >= 0 && t < array[j]; j--)
                array[j + 1] = array[j];
            //插入array[i]
            array[j + 1] = t;
        }
    }


    /**
    * 快速排序
    * 特点：高效，时间复杂度为nlogn。
    * 采用分治法的思想：首先设置一个轴值pivot，然后以这个轴值为划分基准将待排序序列分成比pivot大和比pivot小的两部分，接下来对划分完的子序列进行快排直到子序列为一个元素为止
    */
    public static void quickSort(int array[], int low, int high) {// 传入low=0，high=array.length-1;
        int pivot, p_pos, i, t;// pivot->位索引;p_pos->轴值。
        if (low < high) {
            p_pos = low;
            pivot = array[p_pos];
            for (i = low + 1; i <= high; i++)
                if (array[i] > pivot) {
                    p_pos++;
                    t = array[p_pos];
                    array[p_pos] = array[i];
                    array[i] = t;
                }
            t = array[low];
            array[low] = array[p_pos];
            array[p_pos] = t;
            // 分而治之
            quickSort(array, low, p_pos - 1);// 排序左半部分
            quickSort(array, p_pos + 1, high);// 排序右半部分
        }

    }



}
