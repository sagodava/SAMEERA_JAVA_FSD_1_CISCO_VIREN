package cisco.java.collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet ls1=new LinkedHashSet();
		ls1.add(3);
		ls1.add(5);
		ls1.add('A');
		ls1.add('D');
		ls1.add(5.5f);
		ls1.add(2.4f);
		ls1.add(true);
		System.out.println("Linked hash set1 is"+ls1);
		
		LinkedHashSet <Integer> ls2=new LinkedHashSet<>();
		System.out.println("Enter 8 integer values");
		Scanner a2=new Scanner(System.in);
		
		int x1 = a2.nextInt();
		int x2 = a2.nextInt();
		int x3 = a2.nextInt();
		int x4= a2.nextInt();
		int x5 = a2.nextInt();
		int x6= a2.nextInt();
		int x7 = a2.nextInt();
		int x8= a2.nextInt();
		
		ls2.add(x1);
		ls2.add(x2);
		ls2.add(x3);
		ls2.add(x4);
		ls2.add(x5);
		ls2.add(x6);
		ls2.add(x7);
		ls2.add(x8);
		
		System.out.println("linked hash set2 is"+ls2);
		
		
		TreeSet ts1=new TreeSet();
		
		ts1.add("C Programming");
		ts1.add("FORTARN");
		ts1.add("JAVA");
		ts1.add("PYTHON");
		ts1.add(".NET");
		ts1.add("PASCAL");
		System.out.println("TreeSet is "+ts1);
		System.out.println("Removing the Two Languages ");
		ts1.remove(".NET");
		ts1.remove("JAVA");
		System.out.println("TreeSet is "+ts1);
		
		ts1.add("COBAL");
		ts1.add("BASIC");
		ts1.add("RUBY");
		System.out.println("After adding 3 languages "+ts1);
		System.out.println("TreeSet is "+ts1);
		System.out.println("Check if 'JAVA' is in the  list  "+ts1.contains("JAVA"));
		System.out.println("REmoving all Languages" );
		ts1.clear();
		System.out.println("After adding 3 languages "+ts1);
	}

}
