package pack1;

import java.util.ArrayList;

public class M6 {
	public static void main(String[] args) {
		int[] elements = {10,20,30};
		System.out.println(elements);
		ArrayList list = new ArrayList(); 
		list.add(90);
		list.add(19.5);
		list.add("abc");
		list.add(true);
		list.add('t');
		System.out.println(list); 
		System.out.println(list.get(1));
	}
}
