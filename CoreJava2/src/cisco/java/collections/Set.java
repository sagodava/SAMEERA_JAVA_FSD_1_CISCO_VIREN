package cisco.java.collections;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hs=new HashSet<String>();
		hs.add("apple");
		hs.add("orange");
		hs.add("banana");
		hs.add("pear");
		
		System.out.println("HashSet is "+hs);
		System.out.println("HashSet contains "+hs.contains("pineapple"));
		System.out.println("Is HashSet empty: "+hs.isEmpty());
		System.out.println("HashSet is "+hs);
		System.out.println("Remove the element "+hs.remove("banana"));
		
		
		LinkedHashSet <String> ls=new LinkedHashSet<String>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		ls.add("e");
		ls.add("f");
		System.out.println("LinkedHashSet is "+ls);
		System.out.println("size of Linked HashSet is "+ls.size());
		System.out.println("Does Linked HashSet contain 'g' element: "+ls.contains("g"));
		System.out.println("remove the element "+ls.remove("c"));
		System.out.println("Is LinkedHashSet empty "+ls.isEmpty());
		ls.clear();
		System.out.println("HashSet is "+hs);
		
		TreeSet<String> ts=new TreeSet<String>();
		System.out.println("Enter the 5 country names: ");
		Scanner s=new Scanner(System.in);
		
		String st1=s.nextLine();
		String st2=s.nextLine();
		
		String st3=s.nextLine();
		
		String st4=s.nextLine();
		
		String st5=s.nextLine();
		
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		ts.add(st4);
		ts.add(st5);
		
		System.out.println("TreeSet is "+ts);
		System.out.println("Check if treeSet is empty "+ts.isEmpty());
		System.out.println(ts.contains("Innn"));
		ts.remove(st2);
		
		System.out.println("After removing element "+st2+"TreeSet is: "+ts);
		
		
	}

}
