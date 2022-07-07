// unary increment /decrement operators demo
class Welcome
{
	public static void main(String args[])
	{
		 
		int x=5,y;
		y=++x; // x=x+1 => x=6, y=x => y=6
		System.out.println("x = "+x);  
		System.out.println("y = "+y);  
		x=5;
		y=x++; // y=x => y=5, x=x+1 => x=6 
		System.out.println("x = "+x);  
		System.out.println("y = "+y);  

		


	}
}

