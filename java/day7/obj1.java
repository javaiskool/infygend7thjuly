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
	public boolean equals(Object obj)
	{
		Item item=(Item)obj;
		if(this.iname.equals(item.iname))
			return true;
		else
			return false;
	}
		
	
}
class Tester
{
	public static void main(String args[])
	{
		 
		Item i3=new Item("Fruit","Orange");
		Item i4=new Item("Fruit","Apple");
		Item i5=new Item("Fruit","Apple");
		Item i6=i5;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println(i5==i4);
		System.out.println(i5.equals(i4));
		System.out.println(i5==i6);
		System.out.println(i6.equals(i5));
	}
		 
}
