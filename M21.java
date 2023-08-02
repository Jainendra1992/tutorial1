package pack1;

import java.util.ArrayList;

public class M21 extends ArrayList{
	public static void main(String[] args) {
		M21 list1 =new M21();
		list1.add("abc");
		list1.add("xyz");
		list1.add("hello");
		list1.add("test");
		list1.add("java");
		list1.add("btm");
		list1.add("html");
		list1.add("spring");
		list1.add("js");
		System.out.println(list1);
		list1.removeRange(2, 6);
		System.out.println(list1);
}
}
