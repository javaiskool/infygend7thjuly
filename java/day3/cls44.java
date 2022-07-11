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
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Salary          : "+salary+"\n\n");
	}
	void checksal(Emp e) // parameter is considered as local var
	{
		Emp te=new Emp(10,"Jerry",60000.0f); //object is local
		System.out.println("salary of "+this.eno+" = "+this.salary); //refers invoking object i.e. in this case e3
		System.out.println("salary of "+e.eno+" = "+e.salary);	//refers explicit object parameter i.e. in this case e4 received in e
		System.out.println("salary of "+te.eno+" = "+te.salary); //refers local object created inside a method i.e. in this case te
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
		//garbage collection case 1 
		e1=null; // object with (1,"Kirti",45000.0f) data has no reference, so the memory occupied by the object can be released.
		e3=e2;  
		e2=null;
		//garbage collection case 2
		e4=new Emp(3,"Shehal",87000.0f);
		e4.displayEmpInfo();
		e4=new Emp(4,"Harry",88000.0f); //object with (3,"Shehal",87000.0f) data has no reference, so the memory oocupied by the object can be released. i.e. the object can be garbage collected.
		//garbage collection case 3
		e3.checksal(e4); //e3 is invoking object . in the method it is refered with this keyword. e4 is explicit prameter where object is passed to the method. in the method it is received as e
		// e.displayEmpInfo(); // e is local reference in the method. not available when method execution gets over.
		// te.displayEmpInfo(); //te local ref var that refers to local object created in the method. not available when the method execution gets over. 

		 
	}
}

