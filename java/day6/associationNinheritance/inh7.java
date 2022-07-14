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
	public String getSkill(){return skill;}
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
class TeamHead extends Programmer
{
	private int teamSize;
	public TeamHead()
	{
		this.teamSize=10;
	}
	public TeamHead(int teamSize)
	{
		this.teamSize=teamSize;
	}
	public TeamHead(int eno,String ename,float sal,String skill,int teamSize)
	{
		super(eno,ename,sal,skill);
		this.teamSize=teamSize;
	}
	public void displayteamSize()
	{
		System.out.println("Team Size: "+this.teamSize);
	}
	public void displayTeamHeadInfo()
	{
		 
		System.out.println("employee number : "+this.getEno());
		System.out.println("employee name : "+this.getEname());
		System.out.println("employee salary : "+this.getSal());
		System.out.println("Programmer Skill : "+this.getSkill());
		System.out.println("Team Size: "+this.teamSize);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
	}
}
class Demo
{
	public static void main(String args[])
	{
		TeamHead th1=new TeamHead(101,"kkk",78000.0f,"C++",6);
		th1.displayTeamHeadInfo();
	}
}
		
