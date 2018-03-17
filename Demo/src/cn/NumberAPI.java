package cn;

import java.math.BigDecimal;

public class NumberAPI {
	/*
	商业计算使用BigDecimal。
	尽量使用参数类型为String的构造函数。
	BigDecimal都是不可变的（immutable）的，在进行每一步运算时，都会产生一个新的对象，所以在做加减乘除运算时千万要保存操作后的值。
	
	 二、构造器描述
	BigDecimal(int)       创建一个具有参数所指定整数值的对象。
	BigDecimal(double) 创建一个具有参数所指定双精度值的对象。
	BigDecimal(long)    创建一个具有参数所指定长整数值的对象。
	BigDecimal(String) 创建一个具有参数所指定以字符串表示的数值的对象。

	三、方法描述

	add(BigDecimal)        BigDecimal对象中的值相加，然后返回这个对象。
	subtract(BigDecimal) BigDecimal对象中的值相减，然后返回这个对象。
	multiply(BigDecimal)  BigDecimal对象中的值相乘，然后返回这个对象。
	divide(BigDecimal)     BigDecimal对象中的值相除，然后返回这个对象。
	toString()                将BigDecimal对象的数值转换成字符串。
	doubleValue()          将BigDecimal对象中的值以双精度数返回。
	floatValue()             将BigDecimal对象中的值以单精度数返回。
	longValue()             将BigDecimal对象中的值以长整数返回。
	intValue()               将BigDecimal对象中的值以整数返回。 */
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
        BigDecimal a3=a1.divide(b1,4,BigDecimal.ROUND_HALF_DOWN);//若舍弃部分> .5，则作 ROUND_UP；否则，作 ROUND_DOWN 。
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
