import ArrayTest.Peakelement;

public class solveSudoku 
{
	public static void main(String args[])
	{
	
		int board[][] =   {
				{5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6},
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9}
		};
		solveSudoku obj=new solveSudoku();	
		obj.solveSudokufun(board);
		
		
	}
	public void solveSudokufun(int[][] board)
	{
		int i=0;
		int j=0;
		int count=9;
		
		while(count>-1 && i<9 && j<9)
		{
			 System.out.println(+i + " "+j);
			
			/* if(board[i][j]==0)
			  {
				
	              for(char ele=1;ele<10;ele++)
				    {
                       if(valid(i,j,ele,board))
                    	   board[i][j]=ele;
                       
						  
								 
					}
			  }*/
			 j++;count--;
			 if(count==0)
			  {
			    count=9;i++;j=0;
			  } 
		}
		
		int N = 9;
		/*for (int z = 0; z < N; z++) {
            for (int x = 0; x < N; x++)
                System.out.print(board[z][x] + " ");
            System.out.println();
        }*/
		
		
    }
	public boolean valid(int i, int j, int ele, int[][] board) 
	{
				for(int m=0;m<9;m++)
				{
					if(board[i][m]==ele)
						return false;
					if(board[m][j]==ele)
						return false;
				}
	     int count=3;
	
			while(count>-1 && i<3 && j<3)
			{
				System.out.println("i="+i+" j="+j);
					
						//System.out.println("arr[i]="+arr[i]+" arr[j]="+arr[j]);
               if(board[i][j]==ele)
            	   return false;
				j++;
				count--;
				if(count==0)
				{
		          count=3;
					i++;
					j=0;
				}
			}
				
		return false;
		
		
	}
	
} 




/*	int arr[]= {2,3,4,5};	
int target=5;
int i=0;
int j=0;
int count=3;

while(count>-1 && i<3 && j<3)
{
System.out.println("i="+i+" j="+j);
	
		//System.out.println("arr[i]="+arr[i]+" arr[j]="+arr[j]);

j++;
count--;


if(count==0)
{
  count=3;
	i++;
	j=0;
}
}

*/	
