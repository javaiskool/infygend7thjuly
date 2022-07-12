class Tester
{
	public static void main(String args[])
	{
		//way1
		int ar1[];
		ar1=new int[5];
		ar1[0]=12;ar1[3]=-40;
		
		System.out.println(ar1[0]+" "+ar1[1]+" "+ar1[2]+" "+ar1[3]+" "+ar1[4]);
		System.out.println("\n\n");
		//way2
		int ar2[]=new int[5];
		ar2[2]=8;ar2[3]=9000;
		
		for(int i=0;i<ar2.length;++i)
		System.out.print(ar2[i]+" ");
		System.out.println("\n");

		System.out.println("reverse order display of an array");
		for(int i=ar2.length-1;i>=0;i--)
		System.out.print(ar2[i]+" ");
		System.out.println("\n");
		
		//way3
		int ar3[]={6,3,90,0,-10};
		for(int v:ar3)
		{System.out.print(v+"  ");}
		System.out.println("\n");
	}
}

/* dry run
ar.length = 5
i ar[i]  o/p
0 ar[0]  12  
1 ar[1]  0
2 ar[2]  0
3 ar[3]  -40
4 ar[4]  0
5 
*/

