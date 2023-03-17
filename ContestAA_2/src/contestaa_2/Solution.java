/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contestaa_2;
import static contestaa_2.Result.chessboardGame;
import java.util.*;


/**
 *
 * @author HieuSA
 */


    /**
     * @param args the command line arguments
     */
    class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */


public static String chessboardGame(int x, int y) {
    // Initialize a 2D array to keep track of visited positions
    boolean[][] visited = new boolean[16][16];
    
    // Starting player is player 1
    int currentPlayer = 1;
    
    // Play until a player can't move anymore
    while (true) {
        // Mark current position as visited
        visited[x][y] = true;
        
        // If there are no more moves, current player loses
        if (!canMove(x, y, visited)) {
            return currentPlayer == 1 ? "Second" : "First";
        }
        
        // Switch to the other player
        currentPlayer = currentPlayer == 1 ? 2 : 1;
        
        // Let the other player make a move
        int[] nextPosition = getNextPosition(x, y, visited);
        
        // Update position
        x = nextPosition[0];
        y = nextPosition[1];
    }
}

// Check if a player can move from position (x, y)
public static boolean canMove(int x, int y, boolean[][] visited) {
    return (x >= 3 && y <= 14 && !visited[x-2][y+1]) ||
           (x >= 3 && y >= 2 && !visited[x-2][y-1]) ||
           (x <= 14 && y >= 3 && !visited[x+1][y-2]) ||
           (x >= 2 && y >= 3 && !visited[x-1][y-2]);
}

// Get the next position for the other player
public static int[] getNextPosition(int x, int y, boolean[][] visited) {
    // Try to move in each of the 4 directions
    int[][] directions = {{-2, 1}, {-2, -1}, {1, -2}, {-1, -2}};
    for (int[] dir : directions) {
        int nextX = x + dir[0];
        int nextY = y + dir[1];
        if (nextX >= 1 && nextX <= 15 && nextY >= 1 && nextY <= 15 && !visited[nextX][nextY]) {
            return new int[]{nextX, nextY};
        }
    }
    // If no valid move, return the same position
    return new int[]{x, y};
}



}

    public class Solution{
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int x,y,i = 0;
             while(i<3){
                 x=sc.nextInt();
                 y=sc.nextInt();
                 System.out.println(chessboardGame(x,y));
                 i++;
             }
    }
    }
    

