package pack1;

import java.util.ArrayList;

public class M10 {
	public static void main(String[] args) {
		ArrayList list1 =new ArrayList();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		
		ArrayList list2 = new ArrayList();
		list2.add(600);
		list2.add(700);
		list2.addAll(list1);
		list2.add(800);
		list2.add(900);
		
		System.out.println(list1);
		System.out.println(list2);
	}
}
