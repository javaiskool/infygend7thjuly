class Tester
{
	public static void main(String s[])
	{
		int n=5;
		int factorial=1;
		System.out.println("before loop");
		System.out.print("factorial of "+n+" = ");
		int i=n;
		while (i>=1)
		{
			System.out.print(i+"*");
			factorial=factorial*i--;
			//i=i-1;
		}
		System.out.println(" = "+factorial);
		System.out.println("after loop");
	}
}

	