import java.util.*;
class Emp
{
	private int eno;
	private String ename;
	private Float sal;
	private long contacts[]; //array as instance variable
	public Emp()
	{
	
		this.sal=45000.0f;
	}

	public Emp(int eno,String ename, float sal,long contacts[] )
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.contacts=contacts;
	}
	public int getEno(){return eno;}
	public void setEno(int eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal=sal;}
	public long[] getContacts(){return contacts;}
	public void setContacts(long contacts[]){this.contacts=contacts;}


	public void displayEmpInfo()
	{
		System.out.println("employee number : "+eno);
		System.out.println("employee name : "+ename);
		System.out.println("employee salary : "+sal);
		System.out.println("Employee contact numbers");
		for(int i=0;i<contacts.length;i++)
		System.out.print(contacts[i]+" ");
		System.out.println("\n*****************************\n");
	}
}

class Tester
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		long con[];
		System.out.println("how may contact numbers?");
		int n=sc.nextInt();
		con=new long[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter contact number "+(i+1));
			con[i]=sc.nextLong();
		}

		Emp e1=new Emp(1,"Priti",90000.0f,con);
		e1.displayEmpInfo(); 

	}
}
