package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class M31 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(null);
		list.add(0);
		list.add(400);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
// arraylist allow any number of null element
// null is internally comparsion purpsoe 
// arraylist allowing duplicate and null values
// if null value there dont look for sorting
// Element type of all element should be compareable  separate comparator object