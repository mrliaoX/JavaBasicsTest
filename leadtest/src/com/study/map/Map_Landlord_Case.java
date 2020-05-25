package com.study.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Map_Landlord_Case {
//    案例： 模拟斗地主洗牌和发牌并对牌进行排序的代码实现
	/*分析：
	 * 1、创建扑克牌。
	 *     创建两个数组一个装13个牌的数，一个装花色，把花色和数字拼接起来成一个完整的扑克牌
	 *     创建一个双列集合存储索引和扑克牌，将添加索引大小王存入集合
	 * 2、洗牌
	 *     利用Collections.suff去把存入集合的索引随机排序
	 * 3、发牌
	 *      判断是否小于3张，没有小于就继续发牌 %3发给甲 %2给已 剩下的给丙
	 * 4、看牌
	 *      定义一个看牌的方法，遍历存入TreeSet中的索引，获取索引对应的牌*/
	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
	    String[] color = {"方块","梅花","红桃","黑桃"};
	    HashMap<Integer,String> hm = new HashMap<>();
	    ArrayList<Integer> list = new ArrayList<>();
	    int index = 0;//索引
	    //遍历两个数组将数字和花色拼接并存入集合
	    for (String s1 : num) {
			for(String s2 :color) {
				hm.put(index, s2.concat(s1));
				list.add(index);
				index++;
			}
		}
	    hm.put(index, "小王");
	    list.add(index);
	    index++;
	    hm.put(index, "大王");
	    list.add(index);
	    //洗牌
	    Collections.shuffle(list);//利用Collections.suff去把存入集合的索引随机排序
	    //发牌 创建4个集合分别存储3个人的牌和底牌
	    TreeSet<Integer> jia = new TreeSet<>();//甲
		TreeSet<Integer> yi = new TreeSet<>();//已
		TreeSet<Integer> bin = new TreeSet<>();//丙
		TreeSet<Integer> kingcard = new TreeSet<>();//底牌
	    //遍历list集合发牌
		//判断是否小于3张，没有小于就继续发牌 %3发给甲 %2给已 剩下的给丙
		for(Integer s: list){
	    	if(s >=list.size()-3) {//底牌
	    		kingcard.add(list.get(s));
	    	}else if(s % 3 == 0) {//给甲的牌
	    		jia.add(list.get(s));
	    	}else if(s % 2 == 0) {//给已的牌
	    		yi.add(list.get(s));
	    	}else {
	    		bin.add(list.get(s));//给丙的牌
	    	}
	    }
		lookPoker(hm, jia, "甲");
		lookPoker(hm, yi, "乙");
		lookPoker(hm, bin, "丙");
		lookPoker(hm, kingcard, "底牌");

	}
    //看牌 定义一个看牌的方法，遍历存入TreeSet中的索引，获取索引对应的牌
	private static void lookPoker(HashMap<Integer, String> hm, TreeSet<Integer> ts, String name) {
		System.out.println(name+"底牌是：");
		for(Integer i:ts) {//遍历存入TreeSet中的索引
			System.out.print(hm.get(i)+" ");//获取索引对应的牌
		}
		System.out.println();
	}

}
