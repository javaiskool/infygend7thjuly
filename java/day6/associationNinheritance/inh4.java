//access of properties
class BS //super class
{
	private int y; //private access modifier
	 
	static
	{
		System.out.println("static block in BS");
	}

	public BS()
	{
		System.out.println("default constructor in BS");
		this.y=1; 
	}
	 
	public void displayY()
	{
		System.out.println("y = "+this.y);
		 
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
		BS b1=new BS();
		b1.displayY();
		// b1.displayX(); superclass do not have access to subclass 
		DR d1=new DR();
		d1.displayY();
		d1.displayX();
		 
		 
		 
	}
}

	
