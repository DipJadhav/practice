

public class suduko 
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
			suduko obj=new suduko();	
		obj.solveSudokufun(board);
			int N = 9;
			   for (int z = 0; z < N; z++) {
		            for (int x = 0; x < N; x++)
		                System.out.print(board[z][x] + " ");
		            System.out.println();
		        }
			
		}
		public boolean solveSudokufun(int[][] board)
		{
			int i=0;
			int j=0;
			int count=9;
			
			while(count>-1 && i<9 && j<9)
			{
				
				
				if(board[i][j]==0)
				  {
					
		              for(char ele=1;ele<10;ele++)
					    {
	                       if(valid(i,j,ele,board))
	                       {  
	                    	   board[i][j]=ele;	
	                    	   if(solveSudokufun(board))
	                                return true;
	                            else
	                                board[i][j]='.';
	                       }
	                       
						}
				  }
				 
				 j++;count--;
				 if(count==0)
				  {
				    count=9;i++;j=0;
				  }
				 return false;
			}
			return true;		
			
			
		   
	    }
		public boolean valid(int i, int j, int ele, int[][] board) 
		{
			
			// System.out.println("ele="+ele);
				for(int m=0;m<9;m++)
				   {
						if(board[i][m]==ele)
						{	System.out.println("inside 1="+board[i][m]+" ele="+ele);
							return false;
						}
						if(board[m][j]==ele)
						{	
							System.out.println("inside 2="+board[m][j]+" ele="+ele);
							return false;
						
						}
						if(board[3*(i/3) + i/3][3*(j/3) + i%3] == ele)
						{	
							System.out.println("inside 3="+board[3*(i/3) + i/3][3*(j/3) + i%3]+" ele="+ele);
							return false;
						}
				         
						
						
						
					}
			/*	int count=3;
	            int x=i;
		          int y=j;
				//System.out.println(x + " "+y);
				while(count>-1 && x<=i && y<=j)
				{
					//System.out.println(x + " "+y);
		          
	               if(board[x][y]==ele)
	               { 
	            	   return false;
	               }
	               
					y++;count--;
					if(count==0)
					{
			          count=3;x++;y=0;
					}
				}*/
					
			return true;
			
			
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
