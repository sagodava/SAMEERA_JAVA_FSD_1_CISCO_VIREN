package cisco.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial_DeSerial {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Student obj=new Student(101,25,"ravi","Agra",6);
		FileOutputStream fos=null;
		ObjectOutputStream oss=null;
		try
		{
			fos=new FileOutputStream("/Users/sagodava/Desktop/Assignment");
			oss=new ObjectOutputStream(fos);
			oss.writeObject(obj);
			System.out.println("Serialzation done");
			
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		finally
		{
			oss.close();
			fos.close();
		}
		//Deserial
		Student o=null;
		try
		{
			FileInputStream fis=new FileInputStream("/Users/sagodava/Desktop/Assignment");
			ObjectInputStream ois=new ObjectInputStream(fis);
			o=(Student)ois.readObject();
			ois.close();
			fis.close();
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return;
		}
		catch(ClassNotFoundException cnfe){
			System.out.println("Student class is not found");
			cnfe.printStackTrace();
			return;
		}
		System.out.println("Student Name"+o.getStuName());
		System.out.println("Student Age"+o.getStuAge());
		System.out.println("Student  roll no: "+o.getStuRollNum());
		System.out.println("Student address "+o.getStuAddress());
		System.out.println("Student Height"+o.getStuHeight());
	}

}

//------------
class Student implements java.io.Serializable{
	private int stuRollNum;
	private int stuAge;
	private String stuName;
	private String stuAddress;
	private int stuHeight;
	public Student(int roll,int age,String name,String address,int height)
	{
		this.stuRollNum=roll;
		this.stuAge=age;
		this.stuName=name;
		this.stuAddress=address;
		this.stuHeight=height;
		
	}
	public int getStuRollNum() {
		return stuRollNum;
	}
	public void setStuRollNum(int stuRollNum) {
		this.stuRollNum = stuRollNum;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public int getStuHeight() {
		return stuHeight;
	}
	public void setStuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}
	
}