class Emp
{
	private int eno;
	private String ename;
	private Float sal;
	 
	public Emp()
	{
	
		this.sal=45000.0f;
	}

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
	//way1 
		e[0]=new Emp(1,"Suman",67000.0f); // creating object of Emp type and storing ref in refvar e[0]
		e[1]=new Emp(2,"Parag",77000.0f);
	//way2
		e[0]=new Emp(1,"Suman",67000.0f);
		e[1]=new Emp();

	//way3
		Emp e1,e2;
		e1=new Emp(5,"Harry",80000.0f);
		e2=new Emp(6,"Jerry",75000.0f);
		Emp e[]=new Emp(){e1,e2};
		e[0].displayEmpInfo();
		e[1].displayEmpInfo();

 
		
	}
}
