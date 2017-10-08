package cn;

import java.util.ArrayList;
import java.util.List;

public class ListAPI {
	public static void main(String[] args) {
		StringBuilder buil= new StringBuilder();
		String str = "";
		ArrayList list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		for (int i = 0; i < list.size(); i++) {
			buil.append(list.get(i)).append(",");
			str += list.get(i)+",";
		}
		buil.deleteCharAt(buil.length()-1);
		str.substring(0, str.length()-1);
		System.out.println(buil.toString()+"\n"+str);
	}


}
