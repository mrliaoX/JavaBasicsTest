package com.study.arrays;

import java.util.Arrays;

public class Arrays1 {
	/*Arrays�����
		 ���������в����Ĺ�����.
		 �ṩ�����򣬲��ң����ƣ��Ƚϵȹ��ܡ�
	B:��Ա����
		 pub1ic static String toString(int[] a)
		 pub1ic static void sort(int[] a)
		 public static int binarySearch(int[] a,int key)
		 Arrays�����涼�Ǿ�̬�ķ�������ֱ��Arrays.���þ���*/
	/*Arrays�����toString������ʵ��
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
	 /*Arrays���еĶ��ֲ��ҷ�����ʵ��
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
    //copyof�ĵײ�ʵ�ַ���
     public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }*/
	//equals�ĵײ�ʵ�ַ���
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
		//tostring�������ǰ��������ַ�������ʽ��ӡ����
		System.out.println(Arrays.toString(arr));
		//Arrays���е�sort���ÿ���ʵ�ֵ�
	    Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//binarySearch�Ƕ�������
		System.out.println(Arrays.binarySearch(arr, 4));
		//copyof�����Ǹ���ָ�������ҿ������䣬�������������Ԫ��û�дﵽ�������鶨��ĸ���ʱ���ͻᲹ0
		int[] arr2 = Arrays.copyOf(arr, 4);//��������arr�����������4��Ԫ��
		System.out.println(Arrays.toString(arr2));
		//equals�Ƚϵײ�ԭ���� �ȱȽ�����ĳ��ȣ��ڱȽ϶�Ӧ��Ԫ�أ�����ȷ���false��Ϊ��Ҳ����false
		int[] a1 = {1,2,3,4};
		int[] a2 = {1,2,3,4};
		System.out.println(Arrays.equals(a1, a2));
	}
	
}
