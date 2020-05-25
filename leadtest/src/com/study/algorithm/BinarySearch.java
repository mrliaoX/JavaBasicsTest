package com.study.algorithm;

public class BinarySearch {
	/*二分搜索 查找有序数组中元素对应的索引*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(binarysearch(arr,4));
		System.out.println(binarysearch(arr,6));
		System.out.println(binarysearch(arr,9));
        
	}
    public static int binarysearch(int[] arr,int value) {
    	int max = arr.length-1;  //最大元素下标
        int min = 0;             //最小元素下标
        int mid = (min+max)/2;    //中间元素下标
        while(arr[mid] != value) {   //进行二分搜索条件
        	if(value > arr[mid]) {
        		min = mid+1;
        	}else if(value < arr[mid]) {
        		max = mid-1;
        	}
        	mid = (min+max)/2;
        	if(min > max) {
        		return -1;
        	}
        }
    	return mid;
    }
    
}
