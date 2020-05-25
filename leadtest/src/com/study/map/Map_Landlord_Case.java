package com.study.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Map_Landlord_Case {
//    ������ ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��
	/*������
	 * 1�������˿��ơ�
	 *     ������������һ��װ13���Ƶ�����һ��װ��ɫ���ѻ�ɫ������ƴ��������һ���������˿���
	 *     ����һ��˫�м��ϴ洢�������˿��ƣ������������С�����뼯��
	 * 2��ϴ��
	 *     ����Collections.suffȥ�Ѵ��뼯�ϵ������������
	 * 3������
	 *      �ж��Ƿ�С��3�ţ�û��С�ھͼ������� %3������ %2���� ʣ�µĸ���
	 * 4������
	 *      ����һ�����Ƶķ�������������TreeSet�е���������ȡ������Ӧ����*/
	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
	    String[] color = {"����","÷��","����","����"};
	    HashMap<Integer,String> hm = new HashMap<>();
	    ArrayList<Integer> list = new ArrayList<>();
	    int index = 0;//����
	    //�����������齫���ֺͻ�ɫƴ�Ӳ����뼯��
	    for (String s1 : num) {
			for(String s2 :color) {
				hm.put(index, s2.concat(s1));
				list.add(index);
				index++;
			}
		}
	    hm.put(index, "С��");
	    list.add(index);
	    index++;
	    hm.put(index, "����");
	    list.add(index);
	    //ϴ��
	    Collections.shuffle(list);//����Collections.suffȥ�Ѵ��뼯�ϵ������������
	    //���� ����4�����Ϸֱ�洢3���˵��ƺ͵���
	    TreeSet<Integer> jia = new TreeSet<>();//��
		TreeSet<Integer> yi = new TreeSet<>();//��
		TreeSet<Integer> bin = new TreeSet<>();//��
		TreeSet<Integer> kingcard = new TreeSet<>();//����
	    //����list���Ϸ���
		//�ж��Ƿ�С��3�ţ�û��С�ھͼ������� %3������ %2���� ʣ�µĸ���
		for(Integer s: list){
	    	if(s >=list.size()-3) {//����
	    		kingcard.add(list.get(s));
	    	}else if(s % 3 == 0) {//���׵���
	    		jia.add(list.get(s));
	    	}else if(s % 2 == 0) {//���ѵ���
	    		yi.add(list.get(s));
	    	}else {
	    		bin.add(list.get(s));//��������
	    	}
	    }
		lookPoker(hm, jia, "��");
		lookPoker(hm, yi, "��");
		lookPoker(hm, bin, "��");
		lookPoker(hm, kingcard, "����");

	}
    //���� ����һ�����Ƶķ�������������TreeSet�е���������ȡ������Ӧ����
	private static void lookPoker(HashMap<Integer, String> hm, TreeSet<Integer> ts, String name) {
		System.out.println(name+"�����ǣ�");
		for(Integer i:ts) {//��������TreeSet�е�����
			System.out.print(hm.get(i)+" ");//��ȡ������Ӧ����
		}
		System.out.println();
	}

}
