class Solution {
	public static void main(String args[])
	{
	
		char board[][] =   {{'5','3','4','6','7','8','9','1','2'},{'6','7','2','1','9','5','3','4','8'},{'1','9','8','3','4','2','5','6','7'},{'8','5','9','7','6','1','4','2','3'},{'4','2','6','8','5','3','7','9','1'},{'7','1','3','9','2','4','8','5','6'},{'9','6','1','5','3','7','2','8','4'},{'2','8','7','4','1','9','6','3','5'},{'3','4','5','2','8','6','1','7','9'}};
		Solution obj=new Solution();	
		obj.solveSudoku(board);
		
		
	}
    public void solveSudoku(char[][] board) {
        solve(board);
        int N = 9;
		   for (int z = 0; z < N; z++) {
	            for (int x = 0; x < N; x++)
	                System.out.print(board[z][x] + " ");
	            System.out.println();
	        }
			
    }
    boolean solve(char[][] board){
    	int i=0;
		int j=0;
		int count=9;
    	while(count>-1 && i<9 && j<9)
		{
                
            	if(board[i][j]=='.')
            	{
                    for(char c='1';c<='9';c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board))
                                return true;
                            else
                                board[i][j]='.';
                        }
                    }
                    return false;
                }
            	 j++;count--;
				 if(count==0)
				  {
				    count=9;i++;j=0;
				  }
            	
            	
            }
        return true;
    }
    boolean isValid(char[][] board, int row, int col, char c){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==c)
                return false;
            if(board[row][i]==c)
                return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c)
                return false;
        }
        return true;
    }
} 