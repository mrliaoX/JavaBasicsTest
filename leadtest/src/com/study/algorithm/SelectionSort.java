package com.study.algorithm;

public class SelectionSort {
	/*ѡ��������һ�������ϵ�Ԫ�طֱ����������λ���ϵ�Ԫ�رȽ�
	          С����ǰ�����ں��� 
	         i��ʾÿ�����ں���������λ�ñȽϵ�Ԫ��
	         j��ʾÿ�ֺ�iԪ�رȽϵ�Ԫ�أ��൱��iѡ��һ��Ԫ�غ�Ҫ��������ʣ���Ԫ�����αȽ�
	         j�ͱ�ʾʣ��ÿ��Ԫ��
	         ��һ��:arr[0]�ֱ���arr[1- 4]�Ƚ�,�Ƚ�4��
             �ڶ���:arr[1]�ֱ���arr[2-4]�Ƚ�,�Ƚ�3��
             ������:arr[2]�ֱ���arr[3- 4]�Ƚ�,�Ƚ�2��
             ���Ĵ�:arr[3]��arr[4]�Ƚ�,�Ƚ�1��*/
    public static void selection(int[]arr) {
    	for (int i = 0; i < arr.length-1; i++) {//-1Ϊ�˷�ֹԽ��
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
