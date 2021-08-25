package cisco.java.collections;

public class Immutable_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y=new String ("Mumbai");
		String l=new String ("delhi");
		String p=new String ("Hello");
	
		if(o.equals(l))
		{
			System.out.println("true....");
		}
		else {
			System.out.println("False....");
		}
		if(y.equals(p))
		{
			System.out.println("true....");
		}
		else {
			System.out.println("False....");
		}
		if(t.equals(o))
		{
			System.out.println("true....");
		}
		else {
			System.out.println("False....");
		}
		if(k.equals(y))
		{
			System.out.println("true....");
		}
		else {
			System.out.println("False....");
		}
		if(p.equals(y))
		{
			System.out.println("true....");
		}
		else {
			System.out.println("False....");
		}
if(o==l)
		{
			System.out.println("true....");
		}
		else {
			System.out.println("False....");
		}
if(y==p)
{
	System.out.println("true....");
}
else {
	System.out.println("False....");
}
if(t==o)
{
	System.out.println("true....");
}
else {
	System.out.println("False....");
}
if(k==y)
{
	System.out.println("true....");
}
else {
	System.out.println("False....");
}
if(p==y)
{
	System.out.println("true....");
}
else {
	System.out.println("False....");
}
	}

}
