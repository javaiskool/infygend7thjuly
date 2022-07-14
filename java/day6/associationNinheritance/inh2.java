//execution sequence of constructors in inheritance
class BS //super class
{
	private int pv; //private access modifier
	 

	public BS()
	{
		System.out.println("default constructor in BS");
		this.pv=1; 
	}
	 public BS(int pv)
	{
		System.out.println("parameterized constructor in BS");
		this.pv=pv; 
	}
	public int getPv(){return pv;}

	public void displayBSValues()
	{
		System.out.println("pv = "+this.pv);
		 
	}
}
class DR extends BS //subclass
{
	private int x;
	DR()
	{
		super(5000);
		System.out.println("default constructor in DR");
		x=100;
		
	}
	DR(int p)
	{
		System.out.println("1 parameter  constructor in DR");
		this.x=p;
	}
	DR(int p,int q)
	{
		super(q);
		System.out.println("2 parameter   constructor in DR");
		this.x=p;
	}
	public void displayX()
	{
		System.out.println("x = "+this.x);
	}
	 

}
 
class Demo
{
	public static void main(String s[])
	{
		//BS b1=new BS();
		DR d1=new DR();
		DR d2=new DR(60);
		DR d3=new DR(7,14);
		 
		 
		 
	}
}

	
