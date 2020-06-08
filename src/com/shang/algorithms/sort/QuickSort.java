package com.shang.algorithms.sort;

import java.util.Arrays;

/**
 * @author: shangwei
 * @date: 2020/6/8 16:50
 */
public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int l, int r) {
        if (array == null || l > r || array.length == 1) {
            return;
        }

        int i = l;
        int j = r;
        int k = array[l];
        while (i < j) {

            while (i < j && array[j] > k) {
                j--;
            }
            while (i < j && array[i] <= k) {
                i++;
            }
            swap(array, i, j);
        }

        swap(array, i, l);

        sort(array, l, i - 1);

        sort(array, i + 1, r);

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3,56,56,45,1,2,4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


}
