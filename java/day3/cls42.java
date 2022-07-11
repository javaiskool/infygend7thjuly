class Emp
{
	int eno;// instance variable for employee number 
	String ename;
	float salary;
	
	Emp() //parameterless or default constructor 
	{
		this(10,"Harry");
		System.out.println("parameterless constructor called");
		salary=70000.0f;
	}
	 
	Emp(int eno,String ename ) // parameterized constructor
	{
		 
		System.out.println("parameterized constructor called");
		this.eno=eno;
		this.ename=ename;
		
		 
	}
	void displayEmpInfo() // method 
	{
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Salary          : "+salary+"\n\n");
	}
	void displayMsg()
	{
		System.out.println("Good day");
	}
	 
}

class Tester
{
	public static void main(String args[])
	{
		Emp e1,e2;
		e1=new Emp(); // call to default constructor
		e1.displayEmpInfo();

		e2=new Emp(2,"Raghav" ); //call to parameterized constructor
		e2.displayEmpInfo();

		//e1.displayMsg();
		 
	}
}

