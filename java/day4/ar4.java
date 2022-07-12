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
		System.out.println("*****************************\n");
	}
}

class Tester
{
	public static void main(String args[])
	{
		 //way1
		Emp ea[];
		ea=new Emp[2];
		ea[0]=new Emp();
		ea[1]=new Emp(1,"Arti",40000.0f);
		ea[0].displayEmpInfo();
		ea[1].displayEmpInfo();

		//way2
		Emp e1=new Emp(2,"Ram",60000.0f);
		Emp e2=new Emp(3,"Varsha",56000.0f);
		Emp eb[]=new Emp[]{e1,e2};

		for(int i=0;i<2;i++)
			eb[i].displayEmpInfo();
		//way3
		
		Emp ec[]=new Emp[]{new Emp(),new Emp(4,"Priya",60000.0f),new Emp()};
		for(int i=0;i<ec.length;i++)
			ec[i].displayEmpInfo();
	
		//way4
		Emp ed[]=new Emp[]{e2,new Emp(),ea[1],new Emp(5,"Arjun",78000.0f)};
		for(Emp e:ed)
			e.displayEmpInfo();

	}
}
