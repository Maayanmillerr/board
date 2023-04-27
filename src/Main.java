public class Main  {
    public static void main(String[] args) {
            int i, j;
            int row=115;
            int col=119;
            char [][] board = new char[row][col];
            for(i=0; i<row; i++)
            {
                for(j=0; j<col; j++)
                {
                    board[i][j]='-';
                }
            }

            printBoard(board,row,col);


        }
        static void printBoard(char[][] board, int rows, int cols) {
            int i,j,count;
            int row=rows;
            int col=cols;
            int x = Integer.toString(col).length();
            int y = Integer.toString(row).length();
            for (j = 0; j <= col; j++) {
                if(j==0) {
                    System.out.print("  ");
                    while(Integer.toString(0).length()<y) {
                        System.out.print(" ");
                        y--;
                    }
                    y = Integer.toString(row).length();
                }
                else {
                    while(Integer.toString(j-1).length()<x) {
                        System.out.print(" ");
                        x--;
                    }
                    x = Integer.toString(col).length();
                    System.out.print(j-1+" ");
                }
            }
            System.out.print('\n');
            for(i=0; i<row; i++) {
                while (Integer.toString(i).length() < y) {
                    System.out.print(" ");
                    y--;
                }
                y = Integer.toString(row).length();
                System.out.print(i + " ");
                for (j = 0; j < col; j++) {
                    while (x > 1) {
                        System.out.print(" ");
                        x--;
                    }
                    x = Integer.toString(col).length();
                    System.out.print(board[i][j] + " ");
                }
                System.out.print('\n');

            }   }}