class A
{
	final private int x;
	final public int y;
	public A(){this.x=10;}
	public int getX(){return x;}
	//public void setX(){this.x=this.x*10;}
	public void displayXY()
	{
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
class Tester
{
	public static void main(String s[])
	{
		A a1=new A();
		a1.displayXY();
		//a1.setX();
		//a1.y=20;
		a1.displayXY();
	}
}
