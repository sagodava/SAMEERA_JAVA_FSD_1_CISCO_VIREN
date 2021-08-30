package cisco.java.assg23;

class StudentDetailsDemo
{
	String name;
	int Age;
	char Sec;
	char Gender;
	int subj1,subj2,subj3;
	int Total;
	double Percentage;
	StudentDetailsDemo(String n,int a,char s,char g,int s1,int s2,int s3)
	{
		System.out.println("Name of the student is: "+n);
		System.out.println("Age of the student is: "+a);
		System.out.println("Section of the student is: "+s);
		System.out.println("Gender of the student is: "+g);
		subj1=s1;
		subj2=s2;
		subj3=s3;
		Total=s1+s2+s3;
		Percentage=(Total*100)/300;
		System.out.println("Total Marks of the student is: "+Total);
		System.out.println("Percentage of the student is: "+ Percentage +"\n");
	}
	StudentDetailsDemo(String n,int a,char s,char g)
	{
		System.out.println("Name of the student is: "+n);
		System.out.println("Age of the student is: "+a);
		System.out.println("Section of the student is: "+s);
		System.out.println("Gender of the student is: "+g+"\n");
		
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetailsDemo s1=new StudentDetailsDemo("sameera",22,'A','F',70,80,90);
		StudentDetailsDemo s2=new StudentDetailsDemo("Ravi",25,'A','M');
		StudentDetailsDemo s3=new StudentDetailsDemo("rahul",24,'C','M');
		StudentDetailsDemo s4=new StudentDetailsDemo("durga",20,'B','M',60,50,65);
			
	}

}
