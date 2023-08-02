package pack1;
 import java.util.ArrayList;
public class M7 {
public static void main(String[] args) {
	ArrayList list= new ArrayList();
	list.add(90);
	list.add(9.0); // add method id argument  object type
	list.add('d');
	list.add(true);
	// int i = list.get(0); // get of zero its is return type obj 
	Object obj = list.get(0);
	int  j = (Integer)list.get(0);
	//double d1 = list.get(1);
	Object obj1 = list.get(1);
	double d2 = (Double) obj1; // double obj returning in the form of Object type 
	double d3 = (Double)list.get(1);
	System.out.println(list.get(1));
	
	// char C1 = list.get(2); // char value 
	Object obj2 = list.get(2);
	char c2  = (Character)obj2;
	char c3 = (Character)list.get(2);
	System.out.println(list.get(2));
	
	
  // boolean b1 = list.get(3);
   Object obj3 = list.get(3);
   boolean b2 = (Boolean) obj3;
   boolean b3 = (Boolean) list.get(3);
   System.out.println(list.get(3));
	
 //  list.remove(90);
   list.remove(Integer.valueOf(90));
   System.out.println(list);
   
  //  list.remove('d');
   list.remove(Character.valueOf('d'));
   System.out.println(list);
   
}
}
