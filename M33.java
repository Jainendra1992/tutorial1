package pack1;

import java.util.ArrayList;

class A
{
    int i ;
    A(int i)
    {
    	this .i = i;
    }
}
public class M33 {
public static void main(String[] args) {
	 ArrayList list = new ArrayList();
	 list.add(new A(90));
	 list.add(new A(910));
	 list.add(new A(190));
	 list.add(new A(9));
	 System.out.println(list);
	 
	 A a1 = new A(90);
	 System.out.println(a1);
}
}
// toString internally calling toString method  
// object class toString method calling internally
// all collection object calling internally 
