package pack1;

import java.util.ArrayList;
import java.util.Collections;

class E implements Comparable
{
  int i;
  E(int i)
  {
	  this .i = i;
  }
  public String toString()
  {
	  return "i=" + i;
  }
  public int compareTo(Object obj)
  {
	  return i -((E)obj).i; // this -agrgument of i value
  }
}
public class M37 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(new E(90));
	list.add(new E(190));
	list.add(new E(910));
	list.add(new E(901));
	list.add(new E(290));
	list.add(new E(20));
	list.add(new E(209));
	list.add(new E(930));
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
}
}
// comparable one of the funtional interface 
// compare to method returning 
//compare to method identify which is bigger 