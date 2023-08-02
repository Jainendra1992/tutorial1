package pack1;
import java.util.ArrayList;

class C
{
      int i;
      int j;
      C(int i, int j)
      {
    	  this.i = i;
    	  this.j = j;
      }
		
		  public String toString() 
		  { 
			  return"(i=" + i + ", j=" + j + ")"; 
			  
		  }
		 
}
public class M35 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new C(90,208));
		list.add(new C(910,280));
		list.add(new C(901,820));
		list.add(new C(190,209));
		list.add(new C(920,290));
		list.add(new C(903,920));
		System.out.println(list);
	}
// in the already toString method got overrided 
	// in every collection api class 
	//the class which containg attribute
}
