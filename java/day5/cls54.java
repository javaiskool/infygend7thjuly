class Emp
{
	private static int companyId;
	private String eno;
	private String ename;
	private Float sal;
	private static int counter;
	private String dname;
	static
	{
		System.out.println("static block");
		companyId=1001;
		counter=101;
	}
	public Emp(String ename, float sal,String dname )
	{
		System.out.println("constructor");
		this.ename=ename;
		this.sal=sal;
		this.dname=dname;
		this.eno=this.dname.substring(0,3)+counter++;
	}
	public String getEno(){return eno;}
	//public void setEno(String eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal=sal;}
	public String getDname(){return dname;}
	public void setDname(String Dname){this.dname=dname;}
	public static int getCompanyId(){return companyId;}
	public static void setCompanyId(int companyId)
	{Emp.companyId=companyId;}

	public void displayEmpInfo()
	{
		System.out.println("Company ID      : "+Emp.companyId);
		System.out.println("Department Name : "+this.dname);
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
		Emp e1=new Emp("Suhas",78000.0f,"Accounts");
		Emp e2=new Emp("Priti",67000.0f,"Purchase");
		Emp e3=new Emp("sss",77000.0f,"Computer");
		Emp e4=new Emp("kkk",78000.0f,"Accounts");
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
		e4.displayEmpInfo();
		

		
	}
}
