package com.shang.algorithms.sort;

import java.util.Arrays;

/**
 * @author: shangwei
 * @date: 2019/10/31 19:20
 */
public class BubbleSort {

    /**
     * 单向冒泡排序
     *
     * @param array
     */
    public static void sort(int[] array) {
        for (int i = 1; i <= array.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                    swap(array, i, j);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
    }


    public static void main(String[] args) {
        int[] array = {2, 12, 4, 3, 22, 32, 7, 5, 5, 8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

}
