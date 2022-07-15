final class A
{
	private int x;
	public A(){this.x=10;}
	public int getX(){return x;}
	public void setX(){this.x=this.x*10;}
	public void displayX(){System.out.println("x = "+x);}
	public void displayMSG()
	{
		System.out.println("good day");
	}

}
/*class B extends A // final class cannot be inherited
{
	public void displayMSGB()
	{
		System.out.println("happy learning");
	}
}*/

class Tester
{
	public static void main(String s[])
	{
		/*B b1=new B();
		b1.displayX();
		b1.displayMSG();
		b1.displayMSGB();*/
	}
}
