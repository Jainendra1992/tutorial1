package pack1;

import java.util.ArrayList;

class B
{
 int i;
 B(int i)
 {
	 this .i = i;
 }
 public String toString()
 {
	 return "i" + i;
 }
}
public class M34 {
 public static void main(String[] args) {
	B b1 = new B(90);
	System.out.println(b1);
	ArrayList list = new ArrayList();
	list.add(new B(9));
	list.add(new B(19));
	list.add(new B(91));
	list.add(new B(29));
	list.add(new B(90));
	System.out.println(list);
}
}
