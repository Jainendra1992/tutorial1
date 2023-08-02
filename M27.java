package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class M27 {
public static void main(String[] args) {
	ArrayList list1 = new ArrayList();
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
	Collections.sort(list1);
	System.out.println(list1);
}
}
