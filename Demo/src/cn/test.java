package cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
	public static void main(String[] args) {
		Integer a = new Integer(3);
        Integer b = 3;                  // ��3�Զ�װ���Integer����
        int c = 3;
        System.out.println(a == b);     // false ��������û������ͬһ����
        System.out.println(a == c);     // true a�Զ������int�����ٺ�c�Ƚ�
        
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
//		    ������������ֵ��-128��127֮�䣬��ô����new�µ�Integer���󣬶���ֱ�����ó������е�Integer����
//		    �����������������f1==f2�Ľ����true����f3==f4�Ľ����false��
        
        long a1 = Math.round(11.5);
        long b1 = Math.round(-11.5);System.out.println(a1+"   "+b1);
        
//        (1)�������������ͬ��equals��������true������ô���ǵ�hashCodeֵһ��Ҫ��ͬ��(2)������������hashCode��ͬ�����ǲ���һ����ͬ��
        
        
        System.out.println(reverse("abcdefgh"));//�ַ�����ת
        
        List<Object> list=new ArrayList<>();
        List<Object> synchronizedList = Collections.synchronizedList(list);
        A ab = new B();
        ab = new B();
//        a1b
//        c2
//        3b
//        c2
//        3
	}
	
	public static String reverse(String originStr) {
	      if(originStr == null || originStr.length() <= 1) 
	          return originStr;
	      return reverse(originStr.substring(1)) + originStr.charAt(0);
	}
	
	

}

class A {
	 
    static {
        System.out.print("a");
    }
 
    public A() {
        System.out.print("c");
    }
    
    {
		System.out.println("b");
	}
}
 //1a77772niubib   77772niubib
class B extends A{
	
	{
		System.out.println("2");
	}
 
    static {
        System.out.print("1");
    }
 
    public B() {
        System.out.print("3");
    }
}
