class Item
{
	private String category;
	private String iname;
	
	public Item(String category,String iname)
	{
		this.category=category;
		this.iname=iname;
	}
	public String getCategory(){return category;}
	public String getIname(){return iname;}

	public void displayItemInfo()
	{
		System.out.println("Category : "+category);
		System.out.println("Item Name : "+iname);
	}
	public String toString()
	{
		return iname;
	}
		
	
}
class Tester
{
	public static void main(String args[])
	{
		//Item i1;
		Item i2=null; 
		Item i3=new Item("Fruit","Orange");
		Item i4=new Item("Fruit","Apple");
		Item i5=new Item("Fruit","Apple");
		Item i6=i5;
		//System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
	}
		 
}
