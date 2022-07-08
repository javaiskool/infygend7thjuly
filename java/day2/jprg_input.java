import java.util.*;
class Welcome
{
	public static void main(String args[])
	{
		System.out.println("Hello!");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a string ");  
		String st= sc.nextLine(); 
		System.out.print("Enter a number ");  
		int num1= sc.nextInt(); 
		System.out.println(st+" "+num1);
	}
}
