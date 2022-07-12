class Tester
{
	public static void main(String args[])
	{
		 
		int da[][]=new int[][]{{1,2,6,4},{9,5},{0,3,200}};
		
		for(int r=0;r<da.length;r++)
		{
			//System.out.println("row "+r);
			for(int c=0;c<da[r].length;c++)
			{
				System.out.print(da[r][c]+" ");
			}
			System.out.println("\n\n");
		}
	}
}

/* dry run
r 	c element 	o/p
0 
da[0].length=4
  	0  da[0][0] 	1 2 6 4
	1  da[0][1]
	2  da[0][2]
	3  da[0][3]
	4
1
da[1].length=2
	0 da[1][0] 	9 5
	1 da[1][1]
	2 
2
da[2].length=3
	0 da[2][0] 	0 3 200
	1 da[2][1]
	2 da[2][2]
	3
3
*/	
	
	



		

