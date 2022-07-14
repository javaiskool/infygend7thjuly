//execution sequence of static &  constructors in inheritance
class BS //super class
{
	private int pv; //private access modifier
	 
	static
	{
		System.out.println("static block in BS");
	}

	public BS()
	{
		System.out.println("default constructor in BS");
		this.pv=1; 
	}
	 
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
		System.out.println("default constructor in DR");
		x=100;
		
	}
	 static
	{
		System.out.println("static block in DR");
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
		 
		 
		 
	}
}

	
