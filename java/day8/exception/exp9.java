class Tester
{
	public static void main(String args[])
	{
		try
		{
		int sn=2,en=100,mul=1;
			for(int i=sn;i<en;i=i+2)
			{
				mul=mul*i;
				if(mul>10000) throw new ArithmeticException("product value out of range");
			}
		System.out.println(" nos from "+sn+ " to "+en +" = "+mul);
		System.out.println("operation performed");
		System.out.println("\n");
		} 
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("continue execution \n");
		Tester t=new Tester();
		System.out.println(t);
	}
}
