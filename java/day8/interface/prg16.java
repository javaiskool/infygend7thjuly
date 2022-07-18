interface inf1
{
	public static final int x=100;
	public void displayX();
	public abstract int getX();
}
class A implements inf1
{
	int x=200;
	public void displayX(){System.out.println("x = "+this.x);}
	public int getX(){return x;}
}
 

class B implements inf1
{
	int x=300;
	public void displayX(){System.out.println("value of X is "+inf1.x);}
	public int getX(){return x;}
}
class Tester
{
	public static void main(String args[])
	{
		/*inf1 iface1=new A();
		inf1 iface2=new B();
		iface1.displayX();
		iface2.displayX();*/
		inf1[] iface={new A(),new B()};
		iface[0].displayX();
		iface[1].displayX();
	}
}
