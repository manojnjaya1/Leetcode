class Solution {
public:

    bool flag=false;
    void backt(vector<vector<char>>& board,vector<vector<bool>>& vis, string word,int i,int j,int k)
    {
        if(k==word.size())
        {
            flag=true;
            return;
        }
         if(i>=board.size() || j>=board[0].size())
        {
            return;
        }
        if(i<board.size() && i>=0 && j<board[0].size() && j>=0 && vis[i][j]==false && board[i][j]==word[k])
        {
            
            vis[i][j]=true;
            backt(board,vis,word,i-1,j,k+1);
            backt(board,vis,word,i,j+1,k+1);
            backt(board,vis,word,i+1,j,k+1);
            backt(board,vis,word,i,j-1,k+1);
            vis[i][j]=false;
        }
        
        
    }

    bool exist(vector<vector<char>>& board, string word) {
        int m=board.size();
        int n=board[0].size();
        vector<vector<bool>>vis(m,vector<bool>(n,false));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
      
        backt(board,vis,word,i,j,0);
        if(flag)return true;
            }
        }
        return flag;
    }
};