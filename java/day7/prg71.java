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
	public void displayMSG()
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
	public void displayMSG()
	{
		System.out.println("Happy week end");
	}
	
}
class Tester
{
	public static void main(String args[])
	{
		BS b1=new BS(); //ref of superclass and instance of superclass
		DR d1=new DR(); //ref of subclass and instance of subclass
		b1.displayX();
		b1.displayMSG();
		System.out.println("\n*******************\n");
		d1.displayX();
		d1.displayY();
		d1.displayXY();
		d1.displayMSG();
		BS b2=new DR(); //ref of superclass and instance of subclass
		b2.displayX();
		//b2.displayY();
		//b2.displayXY();
		b2.displayMSG();
				 

	}
}
