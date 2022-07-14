class BS //super class
{
	private int pv; //private access modifier
	int pk;         //package or default access modifier
	protected int pt; //protected access modifier
	public int pb; //public access modifier

	public BS()
	{
		pv=1;pk=2;pt=3;pb=4;
	}
	public BS(int pv,int pk,int pt,int pb)
	{
		this.pv=pv;
		this.pk=pk;
		this.pt=pt;
		this.pb=pb;
	}
	public int getPv(){return pv;}

	public void displayBSValues()
	{
		System.out.println("pv = "+this.pv);
		System.out.println("pk = "+this.pk);
		System.out.println("pt = "+this.pt);
		System.out.println("pb = "+this.pb);
	}
}
class DR extends BS //subclass
{
	private int x;
	DR(){x=100;}
	public void displayX()
	{
		System.out.println("x = "+this.x);
	}
	public void dispBS()
	{
		//System.out.println("pv = "+this.pv);
		System.out.println("pv = "+this.getPv());
		System.out.println("pk = "+this.pk);
		System.out.println("pt = "+this.pt);
		System.out.println("pb = "+this.pb);
	}

}
class A
{
	private int y;
	A(){y=2000;}
	public void displayY()
	{
		System.out.println("y = "+y);
	}
	public void dispBS()
	{
		//System.out.println("pv = "+this.pv);
		//System.out.println("pv = "+getPv());
		//System.out.println("pk = "+this.pk);
		//System.out.println("pt = "+this.pt);
		//System.out.println("pb = "+this.pb);
	}

}
class Demo
{
	public static void main(String s[])
	{
		BS b1=new BS();
		DR d1=new DR();
		b1.displayBSValues();
		d1.displayX();
		d1.dispBS();
		A a=new A();
		a.dispBS();
	}
}

	
