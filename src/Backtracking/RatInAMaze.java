package Backtracking;

//int[][] maze = {
//        {1, 1, 1, 1, 0, 1},
//        {1, 1, 0, 1, 1, 1},
//        {1, 1, 1, 0, 1, 0},
//        {1, 0, 1, 0, 1, 1}
//        };
public class RatInAMaze {
    static char comma = '"';
    public static void solve(int sRaw, int eRaw, int sCol, int ecol,String s ,int[][] maze, boolean[][] isVisited ){
        System.out.println("sraw: " + sRaw);
        System.out.println("scol: " + sCol);
        if (sRaw < 0 || sCol < 0 || sRaw > eRaw || sCol > ecol)return;
        if (sRaw == eRaw && sCol == ecol){
            System.out.println("s: " + comma+ s + comma);
            return;
        }
        if (maze[sRaw][sCol] == 0)return;
        if (isVisited[sRaw][sCol])return;
        //check
        isVisited[sRaw][sCol] = true;

        //go right
        System.out.println(comma + s + comma);
        solve(sRaw, eRaw, sCol+1, ecol, s + "R" , maze, isVisited);

        //go down
         System.out.println(comma + s + comma);
        solve(sRaw+1, eRaw, sCol, ecol, s + "D" , maze, isVisited);

        //go left
        System.out.println(comma + s + comma);
        solve(sRaw, eRaw, sCol-1, ecol, s + "L" , maze, isVisited);

        // go up
        System.out.println(comma + s + comma);
        solve(sRaw-1, eRaw, sCol, ecol, s + "U" , maze, isVisited);

        //back tracking
        isVisited[sRaw][sCol] = false;
    }

    public static void main(String[] args) {
        int raws = 4;
        int cols = 6;
        int[][] maze = {
                {1, 1, 1, 1, 0, 1},
                {1, 1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 1}
        };
        boolean[][] isVisited = new boolean[raws][cols];
        solve(0,raws-1,0,cols-1,"",maze,isVisited);

    }
}
