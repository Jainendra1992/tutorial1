package pack1;

import java.util.ArrayList;
import java.util.Collections;
public class M32 {
public static void main(String[] args) {
	ArrayList list1 = new ArrayList();
	list1.add(190);
	list1.add(120);
	list1.add(40);
	list1.add(100);
	System.out.println(list1);
	Collections.sort(list1);
	System.out.println(list1);
	
	
	ArrayList list2 = new ArrayList();
	list2.add("abc");
	list2.add("xyz");
	list2.add("pqr");
	list2.add("test");
	System.out.println(list2);
	Collections.sort(list2);
	System.out.println(list2);
	
	
	ArrayList list3 = new ArrayList();
	list3.add(new Thread("abc"));
	list3.add(new Thread("xyz"));
	list3.add(new Thread("pqr"));
	list3.add(new Thread("test"));
	System.out.println(list3);
	Collections.sort(list3);
	System.out.println(list3);
}
}
// element should be comparable seprate comparator object is required
// wrapper class already 