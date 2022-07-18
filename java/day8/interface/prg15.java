interface inf1
{
	public static final int x=100;
	public void displayX();
	public abstract int getX();
}
interface inf2 extends inf1
{
	public static final int y=5000;
	public void displayY();
	public abstract int getY();
}

class A implements inf2  
{
	 
	public void displayX(){System.out.println("x = "+this.x);}
	public int getX(){return x;}
	public void displayY(){System.out.println("y = "+this.y);}
	public int getY(){return y;}
}
 
 
class Tester
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.displayX();
		a1.displayY();
		 
	}
}
