class Tester
{
	public static void main(String args[])
	{
		try
		{
		int a=4,b=2;
		System.out.println(a+"/"+b+" = "+(a/b));
		System.out.println("operation performed");
		System.out.println("\n");
		int[] ar={1,3,5,7};
		for(int i=0;i<=ar.length;i++)
		System.out.println("ar"+"["+i+"] = "+(ar[i]));
		System.out.println("\n");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic error");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("error related to array");
		}
		catch(Exception e)
		{
			System.out.println("unexpected error occured");
		}
		String str="123";
		int x=Integer.parseInt(str);
		System.out.println("number from numeric string "+x);
		System.out.println("\n");
		Tester t=new Tester();
		System.out.println(t);
	}
}
