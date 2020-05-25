package com.study.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Map_Test1 {
/*	Map���ϵĹ��ܸ���
	  a:��ӹ���
		* V put(K key,V value):���Ԫ�ء�
			* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
			* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
	  b:ɾ������
		* void clear():�Ƴ����еļ�ֵ��Ԫ��
		* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
	  c:�жϹ���
		* boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		* boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		* boolean isEmpty()���жϼ����Ƿ�Ϊ��
	  d:��ȡ����
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):���ݼ���ȡֵ
		* Set<K> keySet():��ȡ���������м��ļ���
		* Collection<V> values():��ȡ����������ֵ�ļ���
	  e:���ȹ���
		* int size()�����ؼ����еļ�ֵ�Եĸ���*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		Map<String,Integer> m = new HashMap<>();
		m.put("С��", 18);
		m.put("С��", 18);
		m.put("С��", 19);
		Collection<Integer> c = m.values();
		System.out.println(c);
		System.out.println(m.size());
		
	}

	private static void demo3() {//�жϹ���
		Map<String,Integer> m = new HashMap<>();
		m.put("С��", 18);
		m.put("С��", 18);
		m.put("С��", 19);
		
		System.out.println(m.containsKey("С��"));
		
		System.out.println(m.containsValue(18));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.containsKey("����"));
	}

	private static void demo2() {//ɾ������
		Map<String,Integer> m = new HashMap<>();
		m.put("С��", 18);
		m.put("С��", 18);
		m.put("С��", 19);
		m.remove("С��");
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}

	private static void demo1() {//��ӹ���
		Map<String,Integer> m = new HashMap<>();
		m.put("С��", 18);
		m.put("С��", 18);
		m.put("С��", 19);
		System.out.println(m);
		System.out.println(m.size());
	}

}
