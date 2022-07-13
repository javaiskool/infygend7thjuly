
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
	private static Gadget[] gadget=null; 

	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}
	
	public static Gadget[] getGadget(){return gadget;}
	public static void setGadget(Gadget[] gadget){Employee.gadget=gadget;}
	 

	public Employee(int empNo,String empName,float salary )
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		
		  
		
	}
	
	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+empName);
		System.out.println("Salary : "+salary);
		System.out.println("Gadgets : ");
		if(gadget!=null)
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
		Gadget[] g={new Gadget("Laptop"),new Gadget("Tab"),new Gadget("Mobile")};
//,new Gadget("Desktop"),new Gadget("Scanner")};
		Employee[] elist={new Employee(101,"Rashmi",77000.0f),new Employee(102,"Gopal",80000.0f)};
		for(Employee e:elist)
		e.displayEmpInfo();
		Employee.setGadget(g);
		for(Employee e:elist)
		e.displayEmpInfo();

				 
	}
}