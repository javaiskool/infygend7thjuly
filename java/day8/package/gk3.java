package pkg2;
import pkg1.A;
class Tester
{
	public static void main(String args[])
	{
		System.out.println("Tester class in pkg2");
		A a1=new A();
		a1.displayA();
		D d1=new D();
		d1.displayD();
		E e1=new E();
		e1.displayE();
	}
	 
}