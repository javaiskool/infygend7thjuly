class Emp
{
	private int eno;
	private String ename;
	private Float sal;
	 
	
	public Emp(int eno,String ename, float sal )
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		 
	}
	public int getEno(){return eno;}
	public void setEno(int eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal=sal;}

	public void displayEmpInfo()
	{
		System.out.println("employee number : "+this.eno);
		System.out.println("employee name : "+this.ename);
		System.out.println("employee salary : "+this.sal);
		System.out.println("employee contact list");
		System.out.println("*****************************");
	}
public void generateSalSlip(SalAcc eacc)
	{
		System.out.println("Bank Name : "+SalAcc.getBname());
		System.out.println("Account Number : "+eacc.getAcno());
		displayEmpInfo();
	}
	
}
class SalAcc
{
	private static String bname;
	private int acno;
	public SalAcc(int acno)
	{
		this.acno=acno;
	}
	public static String getBname(){return bname;}
	public static void setBname(String bname){SalAcc.bname=bname;}
	public int getAcno(){return acno;}
	public void setAcno(int acno){this.acno=acno;}
	static{bname="ICICI";}
	public void displayEmpAcc(Emp e)
	{
		System.out.print (e.getEname()+" ");
		System.out.println(acno);
	}
}
class Tester
{
	public static void main(String args[])
	{
		Emp[] e ={new Emp(101,"aaa",67000.0f),new Emp(102,"bbb",55000.0f)};
		SalAcc sa[]={new SalAcc(2345),new SalAcc(8967)};
		for(int i=0;i<sa.length;i++)
		sa[i].displayEmpAcc(e[i]);
	}
}



	