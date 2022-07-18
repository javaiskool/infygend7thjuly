class Tester
{
	public static void main(String args[])
	{
		try
		{
		int a=4,b=0;
		System.out.println(a+"/"+b+" = "+(a/b));
		System.out.println("operation performed");
		System.out.println("\n");
		} 
		catch(ArithmeticException ar)
		{
			System.out.println("error related to array");
		}
		finally
		{
			System.out.println("executed finally block");

		}
		System.out.println("continue execution \n");
		Tester t=new Tester();
		System.out.println(t);
	}
}
