class Emp
{
	private int eno;
	private String ename;
	private Float sal;
	 

	public Emp(int eno,String ename, float sal )
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		 
	}
	public int getEno(){return eno;}
	public void setEno(int eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal=sal;}

	public void displayEmpInfo()
	{
		System.out.println("employee number : "+eno);
		System.out.println("employee name : "+ename);
		System.out.println("employee salary : "+sal);
		System.out.println("employee contact list");
		System.out.println("*****************************");
	}
}

class Tester
{
	public static void main(String args[])
	{
		 
		Emp e[]; // refvar array declaration for type Emp (class or UDD)
		e=new Emp[2]; // memory allocation for refvar array and size specification
		e[0]=new Emp(1,"Suman",67000.0f); // creating object of Emp type and storing ref in refvar e[0]
		e[1]=new Emp(2,"Parag",77000.0f);
		e[0].displayEmpInfo();
		e[1].displayEmpInfo();
 
		
	}
}
