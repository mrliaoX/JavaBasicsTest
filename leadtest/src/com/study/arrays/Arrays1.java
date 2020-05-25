package com.study.arrays;

import java.util.Arrays;

public class Arrays1 {
	/*Arrays类概述
		 针对数组进行操作的工具类.
		 提供了排序，查找，复制，比较等功能。
	B:成员方法
		 pub1ic static String toString(int[] a)
		 pub1ic static void sort(int[] a)
		 public static int binarySearch(int[] a,int key)
		 Arrays类里面都是静态的方法所以直接Arrays.调用就行*/
	/*Arrays类里的toString方法的实现
	 * public static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }*/
	 /*Arrays类中的二分查找方法的实现
	  * private static int binarySearch0(int[] a, int fromIndex, int toIndex,int key) {
			int low = fromIndex;
			int high = toIndex - 1;
			
			while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];
			
			if (midVal < key)
			low = mid + 1;
			else if (midVal > key)
			high = mid - 1;
			else
			return mid; // key found
			}
			return -(low + 1);  // key not found.
    }
    //copyof的底层实现方法
     public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }*/
	//equals的底层实现方法
	/* public static boolean equals(int[] a, int[] a2) {
	        if (a==a2)
	            return true;
	        if (a==null || a2==null)
	            return false;

	        int length = a.length;
	        if (a2.length != length)
	            return false;

	        for (int i=0; i<length; i++)
	            if (a[i] != a2[i])
	                return false;

	        return true;
	    }*/
	public static void main(String[] args) {
		int[] arr = {3,2,5,4};
		//tostring方法就是把数组以字符串的形式打印出来
		System.out.println(Arrays.toString(arr));
		//Arrays类中的sort是用快排实现的
	    Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//binarySearch是二分搜索
		System.out.println(Arrays.binarySearch(arr, 4));
		//copyof方法是复制指定数组且可以扩充，当被复制数组的元素没有达到复制数组定义的个数时，就会补0
		int[] arr2 = Arrays.copyOf(arr, 4);//复制数组arr，复制里面的4个元素
		System.out.println(Arrays.toString(arr2));
		//equals比较底层原理是 先比较数组的长度，在比较对应的元素，不相等返回false，为空也返回false
		int[] a1 = {1,2,3,4};
		int[] a2 = {1,2,3,4};
		System.out.println(Arrays.equals(a1, a2));
	}
	
}
