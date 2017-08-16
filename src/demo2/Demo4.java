package demo2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {

		// <>泛型，限定集合中的数据类型
		List<String> list = new ArrayList<String>();

		list.add("琴女");
		list.add("众星之子");
		list.add("风女");

		
		System.out.println(list.get(2));
		
		System.out.println(list.indexOf("风女"));


		System.out.println(list.contains("众星之子"));


		System.out.println(list.isEmpty());


		System.out.println(list.size());
		
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list);
		
		for (String str : list) {
			System.out.println(str);
		}
		

	}
}