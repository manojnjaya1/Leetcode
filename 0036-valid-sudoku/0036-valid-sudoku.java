class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet set=new HashSet();
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    if(!set.add("row"+i+board[i][j]) || !set.add("col"+j+board[i][j]))
                        return false;
                    
                    if(!set.add("box"+i/3+(j/3)*3+board[i][j]))return false;
                }
                
                
                
                
            }
         }
        
        
        
      return true;
        
    }
}