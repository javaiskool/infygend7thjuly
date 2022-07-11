class Emp
{
	int eno; 
	String ename;
	float salary;
	Emp(int eno,String ename,float salary ) 
	{
		this.eno=eno;
		this.ename=ename;
		this.salary=salary;
		 
	}
	void displayEmpInfo()  
	{
		
		this.displayMsg();
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Salary          : "+salary);
		displayMsg(); // can be calles anywhere in the method any no. of times. using keyword this is not compulsary but always a better practice
		System.out.println("\n\n");
	}
	void displayMsg()
	{
		System.out.println("Good Day");
	}
}
class Tester
{
	public static void main(String args[])
	{
		Emp e1,e2,e3,e4;
		e1=new Emp(1,"Kirti",45000.0f);  
		e1.displayEmpInfo();
		e2=new Emp(2,"Raghav",50000.0f);  
		e2.displayEmpInfo();
		
		e1.displayMsg();
		 
	}
}

