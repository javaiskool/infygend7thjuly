class Tester
{
	public static void main(String s[])
	{
		int n=5;
		int sum=0;
		System.out.println("before loop");
		for(int i=1;i<=20;i++)
		{
			sum=sum+i;
			System.out.println(i);	
			if(sum>50)break;
			
		}
		System.out.println(sum);
		System.out.println("after loop");
	}
}

	