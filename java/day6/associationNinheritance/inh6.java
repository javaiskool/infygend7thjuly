class Emp
{
	private int eno;
	private String ename;
	private float sal;
	 
	public Emp()
	{
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
		System.out.println("employee number : "+this.eno);
		System.out.println("employee name : "+this.ename);
		System.out.println("employee salary : "+this.sal);
		System.out.println("*****************************\n");
	}
	
}
class Programmer extends Emp
{
	private String skill;
	public Programmer()
	{
		this.skill="JAVA";
	}
	public Programmer(int eno,String ename,float sal,String skill)
	{
		super(eno,ename,sal);
		this.skill=skill;
	}
	public void displaySkill()
	{
		System.out.println("Programmer Skill : "+this.skill);
	}
	public void displayProgrammerInfo()
	{
		/*this.displayEmpInfo();
		this.displaySkill();*/
		System.out.println("employee number : "+this.getEno());
		System.out.println("employee name : "+this.getEname());
		System.out.println("employee salary : "+this.getSal());
		System.out.println("Programmer Skill : "+this.skill);
		System.out.println("##############################\n");
	}
}
class Tester extends Emp
{
	private String software;
	public Tester()
	{
		this.software=".net";
	}
	public Tester(String software)
	{
		this.software=software;
	}
	public Tester(int eno,String ename,float sal,String software)
	{
		super(eno,ename,sal);
		this.software=software;
	}
	public void displaySoftware()
	{
		System.out.println("Testing software : "+this.software);
	}
	public void displayTesterInfo()
	{
		/*this.displayEmpInfo();
		this.displaySoftware();*/
		System.out.println("employee number : "+this.getEno());
		System.out.println("employee name : "+this.getEname());
		System.out.println("employee salary : "+this.getSal());
		System.out.println("Testing software : "+this.software);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
	}
}
class Demo
{
	public static void main(String args[])
	{
		Programmer p1=new Programmer(101,"kkk",78000.0f,"ORACLE");
		p1.displayProgrammerInfo();
		Tester t1=new Tester(102,"ppp",67000.0f,"java");
		t1.displayTesterInfo();

	
	}
}
		
