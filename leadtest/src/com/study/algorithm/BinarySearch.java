package com.study.algorithm;

public class BinarySearch {
	/*�������� ��������������Ԫ�ض�Ӧ������*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(binarysearch(arr,4));
		System.out.println(binarysearch(arr,6));
		System.out.println(binarysearch(arr,9));
        
	}
    public static int binarysearch(int[] arr,int value) {
    	int max = arr.length-1;  //���Ԫ���±�
        int min = 0;             //��СԪ���±�
        int mid = (min+max)/2;    //�м�Ԫ���±�
        while(arr[mid] != value) {   //���ж�����������
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
