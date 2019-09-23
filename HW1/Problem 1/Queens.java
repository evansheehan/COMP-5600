import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Queens {

    static int[][] board = new int[25][25];
    static int leastConflictingQueens = 25;

    public static void main(String[] args) {

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
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
        printBoard();
        hillclimb();
    }

    public static void hillclimb() {
        int bestScore;
        int bestNeighborX;
        int bestNeighborY;
        List<Integer>bestNeighborCandidates = new ArrayList<Integer>();

        while (!checkGoalState()) {
            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board[x].length; y++) {
                    if (board[x][y] > 25) {
                        int i = x;
                        int j = y;
                        bestNeighborX = x;
                        bestNeighborY = y;

                        bestScore = 26;

                        //North Check
                        while(j > -1) {
                            if (board[i][j] < bestScore) {
                                bestScore = board[i][j];
                                bestNeighborX = i;
                                bestNeighborY = j;
                                bestNeighborCandidates.clear();
                                bestNeighborCandidates.add(j);
                            }
                            else if (board[i][j] == bestScore) {
                                bestNeighborCandidates.add(j);
                            }
                            j--;
                        }

                        i = x;
                        j = y;
                        //South Check
                        while(j < 25) {
                            if (board[i][j] < bestScore) {
                                bestScore = board[i][j];
                                bestNeighborX = i;
                                bestNeighborY = j;
                                bestNeighborCandidates.clear();
                                bestNeighborCandidates.add(j);
                            }
                            else if (board[i][j] == bestScore) {
                                bestNeighborCandidates.add(j);
                            }
                            j++;
                        }

                        Random rand = new Random();
                        bestNeighborY = bestNeighborCandidates.get(rand.nextInt
                            (bestNeighborCandidates.size()));

                        if (bestScore < (board[x][y] - 26)) {
                            board[x][y] -= 26;
                            board[bestNeighborX][bestNeighborY] += 26;
                        }
                        generateCellScores();
                        printBoard();
                        if (checkGoalState()) {return;}
                    }
                }
            }
        }
    }

    public static boolean checkGoalState() {
        int conflictingQueens = 0;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] > 26) {
                    conflictingQueens++;
                }
            }
        }
        if (conflictingQueens > 0) {
            System.out.println("\nGoal state checked...not reached..." + 
                "number of conflicting queens is... " + conflictingQueens);
            if (conflictingQueens < leastConflictingQueens) {
                leastConflictingQueens = conflictingQueens;
            }
            return false;
        }
        System.out.println("Goal state reached");
        return true;
    }

    public static int generateCellScores() {
        int cellScore;
        int totalCellScore = 0;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                cellScore = 0;
                int i = x;
                int j = y;

                //North Check
                //System.out.println("Entering North check");
                while(j > -1) {
                    if(board[i][j] > 25) {
                        //System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                    }
                    //System.out.println("Decrementing j");
                    j--;
                }

                i = x;
                j = y;
                //South Check
                //System.out.println("Entering South check");
                while (j < 25) {
                    if (board[i][j] > 25) {
                        //System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                    }
                    //System.out.println("Incrementing j");
                    j++;
                }

                i = x;
                j = y;
                //East Check
                //System.out.println("Entering East check");
                while (i < 25) {
                    if (board[i][j] > 25) {
                        //System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                    }
                    i++;
                }

                i = x;
                j = y;
                //West Check
                //System.out.println("Entering West check");
                while (i > -1) {
                    if (board[i][j] > 25) {
                        //System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                    }
                    i--;
                }

                i = x;
                j = y;
                //NorthEast Check
                //System.out.println("Entering NorthEast check");
                while (i < 25 && j > -1) {
                    if (board[i][j] > 25) {
                        //System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                    }
                    i++;
                    j--;
                }

                i = x;
                j = y;
                //SouthEast Check
                //System.out.println("Entering SouthEast check");
                while (i < 25 && j < 25) {
                    if (board[i][j] > 25) {
                        //System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                    }
                    i++;
                    j++;
                }

                i = x;
                j = y;
                //SouthWest Check
                //System.out.println("Entering SouthWest check");
                while (i > -1 && j < 25) {
                    if (board[i][j] > 25) {
                        //System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                    }
                    i--;
                    j++;
                }

                i = x;
                j = y;
                //NorthWest Check
                //System.out.println("Entering NorthWest check");
                while (i > -1 && j > -1) {
                    if (board[i][j] > 25) {
                        //System.out.println("Found a Queen at " + i + ", " + j);
                        cellScore++;
                    }
                    i--;
                    j--;
                }

                if (board[x][y] > 25) {
                    cellScore = 26 + cellScore - 8;
                    board[x][y] = cellScore;
                    totalCellScore += cellScore - 26;

                }
                else {
                    board[x][y] = cellScore;
                    totalCellScore += cellScore;
                }
                //System.out.println("Cell score for this cell at coordinates " + x + ", " + y + " was: " + cellScore);
            }
        }

        System.out.println("Cell score generation complete...total cell score for this  state is " + totalCellScore);
        return totalCellScore;
    }


    public static void printBoard() {
        for (int x = 0; x < board.length; x++) {
            System.out.print("]\n[");
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y] + " : ");
            }
        }
    }
}