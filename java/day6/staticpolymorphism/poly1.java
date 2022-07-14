//method overloading
class Painting
{
	private String oname;
	
	public Painting(){oname="circle";}
	public void paint(String cname)
	{
		System.out.println(oname+" is painted with "+cname);
	}
	public void paint(int r, int g, int b)
	{
		System.out.println(oname+" is painted with red-green-blue ("+r+", "+g+", "+b+")");
	}
	public void paint(int ccode)
	{
		System.out.println(oname+" is painted with colour code : "+ccode);
	}
}
class Tester
{
	public static void main(String args[])
	{
		Painting p1=new Painting();
		p1.paint("Purple");
		p1.paint(100,100,100);
		p1.paint("2345");
	}
}