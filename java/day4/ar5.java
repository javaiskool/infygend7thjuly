class Emp
{
	private int eno;
	private String ename;
	private Float sal;
	private long contacts[]; //array as instance variable
	public Emp()
	{
	
		this.sal=45000.0f;
	}

	public Emp(int eno,String ename, float sal,long contacts[] )
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.contacts=contacts;
	}
	public int getEno(){return eno;}
	public void setEno(int eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal=sal;}
	public long[] getContacts(){return contacts;}
	public void setContacts(long contacts[]){this.contacts=contacts;}


	public void displayEmpInfo()
	{
		System.out.println("employee number : "+eno);
		System.out.println("employee name : "+ename);
		System.out.println("employee salary : "+sal);
		System.out.println("Employee contact numbers");
		for(int i=0;i<contacts.length;i++)
		System.out.print(contacts[i]+" ");
		System.out.println("\n*****************************\n");
	}
}

class Tester
{
	public static void main(String args[])
	{
		long c1[]={4546456L,9679789L,3434354L};
		Emp e1=new Emp(1,"Priti",90000.0f,c1);
		long c2[]={3648387L,930123733L};
		Emp e2=new Emp(2,"Mahesh",87000.0f,c2);
		e1.displayEmpInfo();
		e2.displayEmpInfo();		
		
		long c3[]={9839122L,2423455L,57456787L,25434546L};
		e2.setContacts(c3);
		long e2c[]=e2.getContacts();
		System.out.println("modified contact list for employee "+e2.getEno());
		for(long cn:e2c)
			System.out.println(cn);

	}
}
