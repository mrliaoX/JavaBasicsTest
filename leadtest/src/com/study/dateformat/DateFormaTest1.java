package com.study.dateformat;

//import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormaTest1 {
	/*DateFormat��ĸ���
	  DateFormat ������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣
	  �ǳ����࣬����ʹ��������SimpleDateFormat
    SimpleDateFormat���췽��
	  public SimpleDateFormat()
	  public SimpleDateFormat(String pattern)
    ��Ա����
	  public final String format(Date date)
	  public Date parse(String source)*/
	public static void main(String[] args) throws ParseException {
//		demo1();
//		demo2();
//		demo3();
		String s = "2020-4-7";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Date d = sdf.parse(s);//��ʱ���ַ���ת�������ڶ���
		System.out.println(d);
		
	}

	private static void demo3() {
		Date d = new Date();//��ȡ��ǰʱ�����
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");//DIY��ʽ������
        SimpleDateFormat sdf1 = new SimpleDateFormat("y��M��d�� H:m:s");
        System.out.println(sdf.format(d));//���DIY��ʽ������
        System.out.println(sdf1.format(d));
	}

	private static void demo2() {
		Date d = new Date();//��ȡ��ǰʱ�����
        SimpleDateFormat sdf = new SimpleDateFormat();//�������ڸ�ʽ������
        System.out.println(sdf.format(d));//�����ʽ�����ʱ��
	}

	private static void demo1() {
		/*DateFormat df = DateFormat.getDateInstance();*//*����dateformat�ǳ���������û��ʵ����
		                                               ����ͨ��dateformat.getdateInstance��������*/
	    
	}

}
