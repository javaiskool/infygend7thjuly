class Tester
{
	public static void main(String s[])
	{
		int x=10,y=4;
		int ch=600;
		switch(ch)
		{
			case 101 : System.out.println(x+" + "+y+" = "+(x+y));
					break;
			case 600 : System.out.println(x+" - "+y+" = "+(x-y));
					break;
			case 80 : System.out.println(x+" * "+y+" = "+(x*y));
					break;
			case 3 : System.out.println(x+" / "+y+" = "+(x/y));
					break;
			default : System.out.println("invalid option");
		}
	}
}

	