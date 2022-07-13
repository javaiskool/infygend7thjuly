class Emp
{
	private static int companyId;
	private int eno;
	private String ename;
	private Float sal;
	
	static
	{
		System.out.println("static block");
		companyId=1001;
	}
	public Emp(int eno,String ename, float sal )
	{
		System.out.println("constructor");
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
		Emp e1=new Emp(1,"Suhas",78000.0f);
		Emp e2=new Emp(2,"Priti",67000.0f);
		/*System.out.println(Emp.getCompanyId());
		System.out.println(e1.getEno());
		System.out.println(e2.getEno());*/
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		Emp.setCompanyId(1005);
		e1.displayEmpInfo();
		e2.displayEmpInfo();

		
	}
}
