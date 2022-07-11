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

}
class Tester
{
	public static void main(String args[])
	{
		Emp e1=new Emp(1,"Rahul",78000.0f);
		e1.displayEmpInfo();
		System.out.println(e1.getEno()+" salary "+e1.getSalary());
		e1.setSalary(85000.0f);
		System.out.println(e1.getEno()+" updated salary "+e1.getSalary());

	}
}