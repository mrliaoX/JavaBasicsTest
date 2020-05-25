package com.study.algorithm;

public class SelectionSort {
	/*选择排序：用一个索引上的元素分别和其他索引位置上的元素比较
	          小的在前面大的在后面 
	         i表示每轮用于和其他索引位置比较的元素
	         j表示每轮和i元素比较的元素，相当于i选择一个元素后要和数组中剩余的元素依次比较
	         j就表示剩余每个元素
	         第一次:arr[0]分别与arr[1- 4]比较,比较4次
             第二次:arr[1]分别与arr[2-4]比较,比较3次
             第三次:arr[2]分别与arr[3- 4]比较,比较2次
             第四次:arr[3]与arr[4]比较,比较1次*/
    public static void selection(int[]arr) {
    	for (int i = 0; i < arr.length-1; i++) {//-1为了防止越界
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
    }
}
