package com.study.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList_Test1 {
	  /** A:案例演示
	* Arrays工具类的asList()方法的使用
	* Collection中toArray(T[] a)泛型版的集合转数组
*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();

	}
	private static void demo3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		/*当集合转换成数组时，数组长度小于等于集合长度，转换后数组的长度为数组本身的商都
		当数组大于集合的size时，分配的数组长度就和指定的长度一样*/
		String[] arr = list.toArray(new String[1]);
		for (String string : arr) {/*//集合转换成数组不能直接打印数组得遍历除结果，
            因为数组没有重写toString方法*/
			System.out.println(string);
		}
	}
	private static void demo2() {
		int[] arr = {1,2,3,4};
		List<int[]> list = Arrays.asList(arr);//基本数据类型的数组转换成集合，会将整个数组当作一个引用对象
		System.out.println(list);
		Integer[] arr2 = {1,2,3,4};
		List<Integer> list2 = Arrays.asList(arr2);//将数组转换成集合，数组必须是引用数据类型
		System.out.println(list2);
	}
//   将数组转换成集合
	private static void demo1() {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);
		//list.add("d");数组转换成集合不能使用加减元素，但是可以用集合的思想来操作数组，也就是说用其他集合中的方法
		System.out.println(list);
	}

}
