class Tester
{
	public static void main(String s[])
	{
		int x=-57;
		if (x>0 && x%2==0)//x=100 true && true => true
		{
			System.out.println("x is positive and even");
		}
		if (x>0 && x%2!=0)
		{
			System.out.println("x is positive and odd");
		}
		if (x<0 && x%2==0)
		{
			System.out.println("x is negative and even");
		}
		if (x<0 && x%2!=0)
		{
			System.out.println("x is negative and odd");
		}
		if (x==0)
		{
			System.out.println("x is zero");
		}
		
	}
}

	