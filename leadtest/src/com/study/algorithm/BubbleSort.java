package com.study.algorithm;

public class BubbleSort {
/*ð������
 *  jΪ�±꣬���±���бȽ�arr[]��������±�j�ıȽ�
 *  i�ǿ���ÿ��j�Ƚϼ��� ���µ�һ��4�εڶ���3�ε��������ε�����1��
 *  *��һ��:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3],arr[3]��arr[4]�Ƚ�4��
     �ڶ���:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3]�Ƚ�3��
     ������:arr[0]��arr[1],arr[1]��arr [2]�Ƚ�2��
     ������:arr[0]��arr[1]�Ƚ�1��*/
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
