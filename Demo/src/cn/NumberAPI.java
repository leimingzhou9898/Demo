package cn;

import java.math.BigDecimal;

public class NumberAPI {
	/*
	��ҵ����ʹ��BigDecimal��
	����ʹ�ò�������ΪString�Ĺ��캯����
	BigDecimal���ǲ��ɱ�ģ�immutable���ģ��ڽ���ÿһ������ʱ���������һ���µĶ������������Ӽ��˳�����ʱǧ��Ҫ����������ֵ��
	
	 ��������������
	BigDecimal(int)       ����һ�����в�����ָ������ֵ�Ķ���
	BigDecimal(double) ����һ�����в�����ָ��˫����ֵ�Ķ���
	BigDecimal(long)    ����һ�����в�����ָ��������ֵ�Ķ���
	BigDecimal(String) ����һ�����в�����ָ�����ַ�����ʾ����ֵ�Ķ���

	������������

	add(BigDecimal)        BigDecimal�����е�ֵ��ӣ�Ȼ�󷵻��������
	subtract(BigDecimal) BigDecimal�����е�ֵ�����Ȼ�󷵻��������
	multiply(BigDecimal)  BigDecimal�����е�ֵ��ˣ�Ȼ�󷵻��������
	divide(BigDecimal)     BigDecimal�����е�ֵ�����Ȼ�󷵻��������
	toString()                ��BigDecimal�������ֵת�����ַ�����
	doubleValue()          ��BigDecimal�����е�ֵ��˫���������ء�
	floatValue()             ��BigDecimal�����е�ֵ�Ե����������ء�
	longValue()             ��BigDecimal�����е�ֵ�Գ��������ء�
	intValue()               ��BigDecimal�����е�ֵ���������ء� */
	public static void main(String[] args) {
		BigDecimal aDouble =new BigDecimal(1.22);
        System.out.println("construct with a double value: " + aDouble);
        BigDecimal aString = new BigDecimal("1.22");
        System.out.println("construct with a String value: " + aString);
        BigDecimal doubleToString = new BigDecimal(Double.toString(1.22));
        System.out.println("construct with a doubleToString value: " + doubleToString+"\n");
        
        System.out.println("=============");
        System.out.println(aDouble);
        System.out.println(aDouble.longValue());
        System.out.println(aDouble.floatValue());
        System.out.println(aDouble.doubleValue());
        System.out.println(aDouble.intValue());
        System.out.println(aDouble.toString());
        System.out.println("=============");
        
        
        BigDecimal a =new BigDecimal("1.22");
        System.out.println("construct with a String value: " + a);
        BigDecimal b =new BigDecimal("2.22");
        a.add(b);
        System.out.println("aplus b is : " + a);
        a=a.add(b);
        System.out.println("aplus b is : " + a);
        a=a.add(aDouble);
        System.out.println("aplus b is : " + a);
        
        System.out.println("=============");
        BigDecimal a1 =new BigDecimal(1.22);
        System.out.println("construct with a String value: " + a1);
        BigDecimal b1 =new BigDecimal("2.22");
        System.out.println("construct with a String value: " + b1);
        BigDecimal a3=a1.divide(b1,4,BigDecimal.ROUND_HALF_DOWN);//����������> .5������ ROUND_UP�������� ROUND_DOWN ��
        System.out.println(a3);
        
        System.out.println("==============");
        Double d1=new Double(1.22);
        Double d2=new Double(1.22);
        BigDecimal d11 = new BigDecimal(d1.toString());    
        BigDecimal d22 = new BigDecimal(d2.toString());    
        System.out.println(d11.divide(d22, 3, BigDecimal.ROUND_HALF_UP));//1.000
        System.out.println(new Double(d11.divide(d22, 3, BigDecimal.ROUND_HALF_UP).doubleValue()));//1.0
	}

}
