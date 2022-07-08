class Tester
{
	public static void main(String s[])
	{
		int n=5;
		int factorial=1;
		System.out.println("before loop");
		System.out.print("factorial of "+n+" = ");
		for (int i=n;i>=1;i=i-1)
		{
			factorial=factorial*i;
			System.out.print(i+"*");
		}
		System.out.println(" = "+factorial);
		System.out.println("after loop");
	}
}

	