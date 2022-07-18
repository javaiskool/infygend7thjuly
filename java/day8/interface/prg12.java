interface inf1
{
	public static final int x=100;
	public void displayX();
	public abstract int getX();
}
abstract class A implements inf1
{

	public void display(){System.out.println("x = "+this.x);}
	public int getX(){return x;}
}
class B implements inf1
{
	public void displayX(){System.out.println("value of X is "+inf1.x);}
	public int getX(){return x;}
}
class Tester
{
	public static void main(String args[])
	{
		/*A a1=new A();
		a1.displayX();
		System.out.println(a1.getX());*/
		B b1=new B();
		b1.displayX();
		System.out.println(b1.getX());
	}
}
