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
		System.out.println("employee number : "+this.eno);
		System.out.println("employee name : "+this.ename);
		System.out.println("employee salary : "+this.sal);
		System.out.println("employee contact list");
		System.out.println("*****************************");
	}
	
}
class SalAcc
{
	private static String bname;
	private int acno;
	public SalAcc(int acno)
	{
		this.acno=acno;
	}
	public static String getBname(){return bname;}
	public static void setBname(String bname){SalAcc.bname=bname;}
	public int getAcno(){return acno;}
	public void setAcno(int acno){this.acno=acno;}
	static{bname="ICICI";}
	public String displayEmpAcc(Emp e)
	{
		return (e.getEname()+" "+acno+" "+e.getSal());
		 
	}
}
class Tester
{
	public static void main(String args[])
	{
		Emp[] e ={new Emp(101,"aaa",67000.0f),new Emp(102,"bbb",55000.0f)};
		SalAcc sa[]={new SalAcc(2345),new SalAcc(8967)};
		String str[]=new String[e.length];

		for(Emp em:e) // for each em i.e. obj ref of Emp from array e of type Emp
		em.displayEmpInfo();

		for(int i=0;i<sa.length;i++)
		str[i]=sa[i].displayEmpAcc(e[i]);

		System.out.println("list of employees with accno and salary");
		for(int i=0;i<str.length;i++)
		System.out.println(str[i]);
	}
}

/* dry run
em   call
e[0] e[0].dispEmpInfo()
e[1] e[1].dispEmpInfo()

sa.length=2
i 			//str[i] will save 
0 str[0]=sa[0].displayEmpAcc(e[0]) => aaa 2345 67000.0
1 str[1]=sa[1].displayEmpAcc(e[1]) => bbb 8967 55000.0
2

str.length=2
i		o/p
0 	str[0] => aaa 2345 67000.0
1	str[1] => bbb 8967 55000.0
2
*/