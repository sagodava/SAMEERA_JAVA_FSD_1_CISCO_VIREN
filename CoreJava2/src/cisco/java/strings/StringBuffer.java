package cisco.java.strings;

public class StringBuffer {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("HELLO");
		sb.append("Java");
		System.out.println(sb);
		
		sb.insert(1,"Java");
		System.out.println(sb);
		
		sb.replace(1,3,"Java");
		System.out.println(sb);
		
		sb.delete(1,3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
		StringBuilder ss=new StringBuilder("Core");
		
		System.out.println(">>>>>>"+ss);
		System.append("java");
		System.out.println(">>>>>>"+ss);
		System.out.println(ss.length());
		System.out.println(ss.charAt(6));
		System.out.println(ss.reverse());
				
		
	}

}
