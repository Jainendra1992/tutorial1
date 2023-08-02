package pack1;

import java.util.ArrayList;
import java.util.Collections;

class D
{
	int i;
	D(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i=" + i;
	}
	
}
public class M36 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new D(9));
		list.add(new D(19));
		list.add(new D(91));
		list.add(new D(29));
		list.add(new D(92));
		list.add(new D(39));
		list.add(new D(93));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
//all element D type 
// element are not comparble or comparator 
// sorting and avoiding dupalicate
// 