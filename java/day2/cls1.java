class Emp
{
	int empNo;
	String empName;
	float salary;
	String city;
	
	void displayEmpName() // without return without parameter
	{
		System.out.println("employee name : "+empName);
	}
	int getEmpNo() // with return without parameter
	{
		return empNo;
	}
	void changeCity(String ct) // without return with parameter
	{
		city=ct;
	}
	float updateSalary(int bonus) // with return with parameter
	{
		salary=salary+bonus;
		return salary;
	}
	
}
class Tester
{
	public static void main(String s[])
	{
		Emp e;
		e=new Emp();
		float sal=e.salary;
		System.out.println("employee number : "+e.getEmpNo());
		e.displayEmpName();
		System.out.println("salary : "+sal);
		e.changeCity("Mumbai");
		sal=e.updateSalary(5000);
		System.out.println("changed city : "+e.city);
		System.out.println("updated salary : "+sal);

	
	}
}
