class Emp
{
	private int eno;
	private String enm;
	private float sal;

	public Emp(int eno,String enm,float sal)
	{
		this.eno=eno;
		this.enm=enm;
		this.sal=sal;
	}
	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+this.eno);
		System.out.println("Employee Name : "+this.enm);
		System.out.println("Employee Salary : "+this.sal+"\n");
	}
	public int getEno(){return eno;}
	public void setEno(int eno){this.eno=eno;}
	public String getEnm(){return enm;}
	public float getSal(){return sal;}
	public void setEnm(String enm){this.enm=enm;}
	public void setSal(float sal){this.sal=sal;}
	public void generateSalSlip(SalAcc eacc)
	{
		System.out.println("Bank Name : "+SalAcc.getBname());
		System.out.println("Account Number : "+eacc.getAcno());
		displayEmpInfo();
	}
		
	
}
class SalAcc
{
	private static String bname;//bankName
	private int acno;
	static
	{
		SalAcc.bname="ICICI";
	}
	public SalAcc(int acno)
	{this.acno=acno;}
	public static String getBname(){return bname;}
	public static void setBname(String bname){SalAcc.bname=bname;}
	public int getAcno(){return acno;}
	public void setAcno(int acno){this.acno=acno;}
}
class Tester
{
	public static void main(String args[])
	{
		Emp e1=new Emp(101,"Ashwin",67000.0f);
		Emp e2=new Emp(102,"Priya",70000.0f);
	
		SalAcc sa1=new SalAcc(4567);
		SalAcc sa2=new SalAcc(7890);
		
		e1.generateSalSlip(sa1);
		e2.generateSalSlip(sa2);
	}
}

	
	