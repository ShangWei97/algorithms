package com.shang.algorithms.binary;

/**
 * @author: shangwei
 * @date: 2019-10-31 07:14
 */
public class BinarySearch {

	/**
	 * 二分法查找
	 *
	 * @param array 必须有序
	 * @param key
	 * @return
	 */
	public static int search(int[] array, int key) {
		int l = 0;
		int h = array.length - 1;
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (array[mid] > key) {
				h = mid - 1;
			}
			if (array[mid] == key) {
				return mid;
			}
			if (array[mid] < key) {
				l = mid + 1;
			}
		}
		return -1;
	}


	public static void main(String[] args) {

		int[] a = {1, 4, 7, 10, 11, 12};
		System.out.println(search(a, 11));
	}


}
