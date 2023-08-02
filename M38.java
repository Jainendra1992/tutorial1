package pack1;

import java.util.ArrayList;
import java.util.Collections;

class F implements Comparable
{
	int i;
	int j;
	F(int i , int j)
	{
		this.i = i;
		this .j = j;
	}
	public String toString()
	{
		return "(" + i + "," + j + ")";
	}
	public int compareTo(Object obj)
	{
		//return i - ((F)obj).i;
		return j - ((F)obj).j;
	}
}
public class M38 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(new F(10,20));
	list.add(new F(1,220));
	list.add(new F(102,250));
	list.add(new F(105,202));
	list.add(new F(110,230));
	list.add(new F(107,210));
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
}
}
// compre to shorting base one atribute 
