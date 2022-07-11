class Emp
{
	int eno;// instance variable for employee number 
	String ename;
	float salary;
	void displayEmpInfo() // method 
	{
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Salary          : "+salary+"\n\n");
	}
	Emp() //parameterless or default constructor 
	{
		//System.out.println("constructor called");
		eno=1;
		ename="Kirti";
		salary=70000.0f;
	}
	Emp(int en,String enm) //parameterised constructor1
	{
		eno=en;
		ename=enm;
		salary=50000.0f;
	}
	Emp(int eno,String ename,float sal) // parameterized constructor2
	{
		eno=eno;
		this.ename=ename;
		salary=sal;
	}
	Emp(String ename,int eno) //parameterized constructor3
	{
		this.eno=eno;
		this.ename=ename;
		salary=60000.0f;
	}
}

class Tester
{
	public static void main(String args[])
	{
		Emp e1,e2,e3,e4;
		e1=new Emp(); // call to default constructor
		e2=new Emp(2,"Raghav"); //call to parameterized constructor1
		e3=new Emp(3,"Prakash",82000.0f); //call to parametrized constructor2
		e4=new Emp("Asha",4);  //call to parametrized constructor3
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
		e4.displayEmpInfo();

		/*e.displayEmpInfo();
		e.eno=101;
		e.ename="Harsha";
		e.salary=67000.0f;
		e.displayEmpInfo();*/
	}
}

