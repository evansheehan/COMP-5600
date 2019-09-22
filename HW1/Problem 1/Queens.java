public class Queens {

    static int[][] board = new int[25][25];

    public static void main(String[] args) {

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                //board[x][y] = x == y ? 50 : 2;
                board[x][y] = x == y ? 50 : 2;
                System.out.print(board[x][y] + " ,");
            }
        }

        generateCellScores();
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                //board[x][y] = x == y ? 50 : 2;
                System.out.print(board[x][y] + " ,");
            }
        }
    }





    public static void generateCellScores() {
        int cellScore;
        int totalCellScore = 0;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                cellScore = 0;
                int i = x;
                int j = y;

                //North Check
                System.out.println("Entering North check");
                while(j > -1) {
                    if(board[i][j] > 25) {
                        System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                        totalCellScore++;
                    }
                    //System.out.println("Decrementing j");
                    j--;
                }

                i = x;
                j = y;
                //South Check
                System.out.println("Entering South check");
                while (j < 25) {
                    if (board[i][j] > 25) {
                        System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                        totalCellScore++;
                    }
                    //System.out.println("Incrementing j");
                    j++;
                }

                i = x;
                j = y;
                //East Check
                System.out.println("Entering East check");
                while (i < 25) {
                    if (board[i][j] > 25) {
                        System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                        totalCellScore++;
                    }
                    i++;
                }

                i = x;
                j = y;
                //West Check
                System.out.println("Entering West check");
                while (i > -1) {
                    if (board[i][j] > 25) {
                        System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                        totalCellScore++;
                    }
                    i--;
                }

                i = x;
                j = y;
                //NorthEast Check
                System.out.println("Entering NorthEast check");
                while (i < 25 && j > -1) {
                    if (board[i][j] > 25) {
                        System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                        totalCellScore++;
                    }
                    i++;
                    j--;
                }

                i = x;
                j = y;
                //SouthEast Check
                System.out.println("Entering SouthEast check");
                while (i < 25 && j < 25) {
                    if (board[i][j] > 25) {
                        System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                        totalCellScore++;
                    }
                    i++;
                    j++;
                }

                i = x;
                j = y;
                //SouthWest Check
                System.out.println("Entering SouthWest check");
                while (i > -1 && j < 25) {
                    if (board[i][j] > 25) {
                        System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                        totalCellScore++;
                    }
                    i--;
                    j++;
                }

                i = x;
                j = y;
                //NorthWest Check
                System.out.println("Entering NorthWest check");
                while (i > -1 && j > -1) {
                    if (board[i][j] > 25) {
                        System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                        totalCellScore++;
                    }
                    i--;
                    j--;
                }

                if (board[x][y] > 25) {
                    board[x][y] = 26 + cellScore - 8;
                }
                else {
                    board[x][y] = cellScore;
                }
                System.out.println("Cell score for this cell at coordinates " + x + ", " + y + " was: " + cellScore);
            }
        }

        System.out.println("Cell score generation complete.");
    }
}