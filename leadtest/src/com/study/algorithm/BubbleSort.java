package com.study.algorithm;

public class BubbleSort {
/*冒泡排序
 *  j为下标，用下标进行比较arr[]里面就是下标j的比较
 *  i是控制每轮j比较几次 如下第一轮4次第二轮3次第三轮两次第四轮1次
 *  *第一轮:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3],arr[3]与arr[4]比较4次
     第二轮:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3]比较3次
     第三轮:arr[0]与arr[1],arr[1]与arr [2]比较2次
     第四轮:arr[0]与arr[1]比较1次*/
	public static void bubble(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
	}

}
