
class Gadget
{
	private String gname;
	public Gadget(String gname)
	{
		this.gname=gname;
	}
	public String getGname(){return gname;}
	public void setGname(String gname){this.gname=gname;}
}


class Employee
{
	private int empNo;
	private String empName;
	private float salary;
	private Gadget gadget; 

	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}
	
	public Gadget getGadget(){return gadget;}
	public void setGadget(Gadget gadget){this.gadget=gadget;}
	 

	public Employee(int empNo,String empName,float salary,Gadget gadget )
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
		System.out.println("Gadget : "+gadget.getGname());
		 
	}
	
}
 		


class Tester
{
	public static void main(String s[])
	{
		Gadget g1=new Gadget("Laptop");
		Employee e1=new Employee(101,"Rashmi",77000.0f,g1);
		e1.displayEmpInfo();
		System.out.println("employee number : "+e1.getEmpNo());
		System.out.println("gadget name : "+e1.getGadget().getGname()); 
		 
	}
}