package pack1;

import java.util.ArrayList;

public class M14 {
	public static void main(String[] args) {
		ArrayList list1 =new ArrayList();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		System.out.println(list1);
		System.out.println(list1.remove(2)); // remove which takes int
		System.out.println(list1);
}
}