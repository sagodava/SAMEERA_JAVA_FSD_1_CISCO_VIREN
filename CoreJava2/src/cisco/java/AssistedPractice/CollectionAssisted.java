package cisco.java.AssistedPractice;
import java.util.*;

public class CollectionAssisted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList :");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Bangalore");
	      city.add("Delhi");    	   
	      System.out.println(city);
	      
	    //creating vector  
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);
	      
	    //creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      }
	}
}
	       