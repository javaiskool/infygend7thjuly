
class Gadget
{
	private String gname;
	public Gadget(String gname)
	{
		this.gname=gname;
	}
	public String getGname(){return gname;}
	public void setGname(String gname){this.gname=gname;}
	static 
	{
		System.out.println("static in Gadget class");
	}
}


class Employee
{
	private int empNo;
	private String empName;
	private float salary;
	private Gadget[] gadget; 

	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}
	
	public Gadget[] getGadget(){return gadget;}
	public void setGadget(Gadget[] gadget){this.gadget=gadget;}
	 

	public Employee(int empNo,String empName,float salary,Gadget[]  gadget )
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		this.gadget=gadget;
		  
		
	}
	
	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+empName);
		System.out.println("Salary : "+salary);
		System.out.println("Gadgets : ");
		for(Gadget g:gadget)
		System.out.println(g.getGname());
		 
	}
	static 
	{
		System.out.println("static in Employee class");
	}
	
}
 		


class Tester
{
	static 
	{
		System.out.println("static in Tester class");
	}
	public static void main(String s[])
	{
		Gadget[] g1={new Gadget("Laptop"),new Gadget("Tab"),new Gadget("Mobile")};
		Employee e1=new Employee(101,"Rashmi",77000.0f,g1);
		e1.displayEmpInfo();
		Gadget[] g2={new Gadget("Laptop"),new Gadget("Tab")};
		Employee e2=new Employee(102,"Gopal",80000.0f,g2);
		e2.displayEmpInfo();
		
		 
	}
}