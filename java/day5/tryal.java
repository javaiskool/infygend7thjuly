class A
{	
	 
	static
	{
		System.out.println("static in A");
	}
	public static void dispmsg()
	{
		System.out.println("hello in A static");
	}
	 
}
 
class Tester
{
	static
	{
		System.out.println("static1 in Tester");
	}
	public static void main(String S[])
	{
		//A a1=new A();
		System.out.println(" in main");
		A.dispmsg();
		 
	}
	static
	{
		System.out.println("static2 in Tester");
	}

}
