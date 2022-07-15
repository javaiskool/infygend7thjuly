class BS
{
	private int x;
	public BS(){this.x=100;}
	public BS(int x){this.x=x;}
	public void displayX()
	{
		System.out.println("x = "+this.x);
	}
	public int getX(){return x;}
	public static void displayMSG()
	{
		System.out.println("good morning");	
	}
	
}
class DR extends BS
{
	private int y;
	public DR(){this.y=200;}
	public DR(int y){super(y*10);this.y=y;}
	public DR(int x,int y){super(x);this.y=y;}
	public void displayY()
	{
		System.out.println("y = "+this.y);
	}
	public void displayXY()
	{
		this.displayX();
		//System.out.println("x = "+this.getX());
		System.out.println("y = "+this.y);
	}
	public static void displayMSG()
	{
		System.out.println("Happy week end");
	}
	
}
class Tester
{
	public static void main(String args[])
	{
		BS b1=new BS();
		DR d1=new DR();
		BS b2=new DR();
		b1.displayMSG();
		d1.displayMSG();
		b2.displayMSG();

	}
}
