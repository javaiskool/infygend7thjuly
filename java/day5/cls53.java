class Emp
{
	private static int companyId;
	private String eno;
	private String ename;
	private Float sal;
	private static int counter;
	
	static
	{
		System.out.println("static block");
		companyId=1001;
		counter=101;
	}
	public Emp(String ename, float sal )
	{
		System.out.println("constructor");
		this.eno="E"+counter++;
		this.ename=ename;
		this.sal=sal;
	}
	public String getEno(){return eno;}
	//public void setEno(String eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal=sal;}
	public static int getCompanyId(){return companyId;}
	public static void setCompanyId(int companyId)
	{Emp.companyId=companyId;}

	public void displayEmpInfo()
	{
		System.out.println("Company ID      : "+Emp.companyId);
		System.out.println("employee number : "+this.eno);
		System.out.println("employee name : "+this.ename);
		System.out.println("employee salary : "+this.sal);
		System.out.println("*****************************\n");
	}
}

class Tester
{
	public static void main(String args[])
	{
		Emp e1=new Emp("Suhas",78000.0f);
		Emp e2=new Emp("Priti",67000.0f);
		Emp e3=new Emp("sss",77000.0f);
		Emp e4=new Emp("kkk",78000.0f);
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
		e4.displayEmpInfo();
		

		
	}
}
