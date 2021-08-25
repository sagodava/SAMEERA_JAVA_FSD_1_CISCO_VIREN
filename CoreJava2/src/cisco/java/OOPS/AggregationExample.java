package cisco.java.OOPS;
class Operation
{
	int square(int n)
	{
		return n*n;
		}
}
class AggregationExample
{
	Operation op;
	double pi=3.14;
	double area(int radius)
	{
		op=new Operation();
		int rsquare=op.square(radius);
		return pi*rsquare;
	}

//public class AggregationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationExample c=new AggregationExample();
		double result=c.area(5);
		System.out.println(result);
	}

}
