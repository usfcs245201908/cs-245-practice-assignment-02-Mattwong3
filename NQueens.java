public class NQueens {
    private int n;
    private int[][] board;

    private int space = -1;
    private int queen = -2;
    private int tried = -3;

    public NQueens(int n){
        this.n = n;
         board = new int [n][n];


         for (int i = 0;i<n;i++){
             for(int k = 0;k<n;k++){
                 board[i][k] = space;
             }
         }

    }

    //reset board function to backtrack
    private void resetBoard(int row){
       for(int i = 0;i<n;i++){
           if(board[row][i] == row){
               board[row][i]=space;
           }
       }

    }

    public boolean placeNQueens (){
        //placeQUeens
        //use row number for place markers
       return setPieces(n);
    }


        // Failed to find solution




    public boolean setPieces(int row){
        boolean outcome = false;
        for(int i = 0;i<n;i++) {
            if (isSpaceTaken(i)>=0){
                board[i][isSpaceTaken(i)]= queen;

                setPieces(row+1);
                outcome = true;
            }




        }
        return outcome;
    }

    public int isSpaceTaken(int row) {
        //to find out if the space is taken or available
        int outcome = 0;
        for (int i = 0; i < n; i++) {

            if (board[row][i] == space) {
                outcome = i;

            } else {
                outcome = tried;
            }

    }
        return outcome;
    }




    public void printToConsole(){
            for(int i = 0;i<n;i++){
                System.out.print("\n");
                for(int j = 0;j<n;j++){
                    if(board[i][j]==-2){
                        System.out.print(" Q ");
                    }
                    else{
                        System.out.println(" _ ");
                    }
                }
            }

    }


}
