class Emp
{
	private int eno;
	private String ename;
	private float salary;

	public Emp(int eno,String ename,float salary)
	{
		this.eno=eno;
		this.ename=ename;
		this.salary=salary;
	}
	public int getEno(){return eno;}
	public void setEno(int eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSalary(){return salary;}
	public void setSalary(float salary){this.salary=salary;}


	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+salary);
	}
	void updateSalary(float bonus)
	{
		if(this.salary<=50000)
			bonus=bonus+2000;
		else
			bonus=bonus-1500;
		this.salary=this.salary+bonus;
	}
}
class Tester
{
	public static void main(String args[])
	{
		Emp e1=new Emp(1,"Rahul",78000.0f);
		Emp e2=new Emp(2,"Arti",35000.0f);
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e1.updateSalary(5000.0f);
		e2.updateSalary(5000.0f);
		e1.displayEmpInfo();
		e2.displayEmpInfo();


	}
}