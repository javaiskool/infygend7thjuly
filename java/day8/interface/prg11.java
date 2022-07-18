abstract class A
{
	abstract public void displayMSG();
}
class B extends A
{
	final public void displayMSG(){System.out.println("hello");}
}
class C extends B
{

	public void displayMSG(){System.out.println("Welcome"); }
}
class Tester
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.displayMSG();
		c1.display();
	}
}

	
	
	