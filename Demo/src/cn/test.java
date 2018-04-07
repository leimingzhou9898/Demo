package cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
	public static void main(String[] args) {
		Integer a = new Integer(3);
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
        
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
//		    整型字面量的值在-128到127之间，那么不会new新的Integer对象，而是直接引用常量池中的Integer对象，
//		    所以上面的面试题中f1==f2的结果是true，而f3==f4的结果是false。
        
        long a1 = Math.round(11.5);
        long b1 = Math.round(-11.5);System.out.println(a1+"   "+b1);
        
//        (1)如果两个对象相同（equals方法返回true），那么它们的hashCode值一定要相同；(2)如果两个对象的hashCode相同，它们并不一定相同。
        
        
        System.out.println(reverse("abcdefgh"));//字符串反转
        
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
