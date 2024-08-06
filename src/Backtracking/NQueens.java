package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void print2DArray(char[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int count = 0;
        int max = 0;
//        System.out.println(solveNQueens(n));
        List<List<String>> lists = solveNQueens(n);
        for (List<String> list:lists) {
            count = 0;
            for (int i = 0; i < list.size(); i++) {
                for (var c: list.get(i).toCharArray()) {
                    if (c == 'Q'){
                        count++;
                    }
                }
            }
            max = Math.max(max,count);
        }

        System.out.println(lists);
        System.out.println(max);
    }

    static List<List<String>> list = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        print2DArray(board);
        return solve(board, 0);

    }

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        //check row

        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q') return false;
        }
        //check col
        for (char[] chars : board) {
            if (chars[col] == 'Q') return false;
        }
        // check left up to stand diagonal
        int i = row;
        int j = col;

        while (i >= 0 && j >= 0) {
            if (board[i--][j--] == 'Q') return false;
        }
        // check stand  to right down diagonal
        i = row;
        j = col;

        while (i < n && j < n) {
            if (board[i++][j++] == 'Q') return false;
        }

        // check right up to stand diagonal
        i = row;
        j = col;

        while (i >= 0 && j < n) {
            if (board[i--][j++] == 'Q') return false;
        }

        // check stand to left down diagonal
        i = row;
        j = col;

        while (i < n && j >= 0) {
            if (board[i++][j--] == 'Q') return false;
        }
        return true;
    }



    public static List<List<String>> solve(char[][] board, int row) {
        int n = board.length;
        if (n == row) {
            List<String> list1 = new ArrayList<>();
            for (char[] chars : board) {
                StringBuilder s = new StringBuilder();

                    s.append(chars);


                list1.add(s.toString());
            }
            list.add(list1);
            return list;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                solve(board, row + 1);
                board[row][i] = '.';
            }
        }

        return list;
    }
}
