class Tester
{
	public static void main(String s[])
	{
		int n=5;
		 
		System.out.println("before loop");
		for(int i=1;i<=20;i++)
		{
			if(i%2==0 && i%3==0)continue;
			System.out.println(i);	
		}
		System.out.println("after loop");
	}
}

	