package pkg2;
import pkg1.*;
class D
{
	
	public void displayD()
	{
		System.out.println("display in class B");
		A a1=new A();
		//System.out.println("pv = "+a1.pv);
		//System.out.println("pk = "+a1.pk);
		//System.out.println("pt = "+a1.pt);
		System.out.println("pb = "+a1.pb);
	}
}