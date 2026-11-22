class Solution {

    boolean help(char[][] board,String word,int row,int col,int i,boolean[][] visiter){
        int rows=board.length;
        int columns=board[0].length;
        if(row<0 || col<0 || row>=rows || col>=columns) return false;
        if(board[row][col]!=word.charAt(i)) return false;
        if(i==word.length()-1) return true;

        visiter[row][col]=true;

        boolean a=false,b=false,c=false,d=false;


        // up
        if(row-1>=0  &&  row-1<rows && col>=0  &&  col<columns &&  visiter[row-1][col]==false)
         a=help(board,word,row-1,col,i+1,visiter);

        // down
        if(row+1>=0  &&  row+1<rows && col>=0  &&  col<columns && visiter[row+1][col]==false)
         b=help(board,word,row+1,col,i+1,visiter);

        // right
        if(row>=0  &&  row<rows && col+1>=0  &&  col+1<columns && visiter[row][col+1]==false)
         c=help(board,word,row,col+1,i+1,visiter);

        // left
        if(row>=0  &&  row<rows && col-1>=0  &&  col-1<columns && visiter[row][col-1]==false)
         d=help(board,word,row,col-1,i+1,visiter);

        visiter[row][col]=false;


        return a || b || c || d;


    }

    public boolean exist(char[][] board, String word) {
        boolean[][] visiter=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                char c=board[i][j];
                if(c==word.charAt(0)) {
                    
                    boolean ans=help(board,word,i,j,0,visiter);
                    if(ans==true) return true;
                }
            }
        }

        return false;
    }
}