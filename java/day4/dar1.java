class Tester
{
	public static void main(String args[])
	{
		int da[][];
		da=new int[3][4];
		da[0][1]=20;da[2][3]=400;
		 
		
		for(int r=0;r<3;r++)
		{
			System.out.println("row "+r);
			for(int c=0;c<da[r].length;c++)
			{
				System.out.print(da[r][c]+" ");
			}
			System.out.println("\n");
		}
		for(int row[]:da)
		{
			System.out.println("\n");
			for(int col:row)
				{System.out.print(col+" ");}
		}	
					
	
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

