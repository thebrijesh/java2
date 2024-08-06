package Others;

public class sudoku {
    private static void sudokus(int[][] array2D) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k =j*3; k < j*3 +3; k++) {
                    for (int l = i*3; l <i*3 + 3; l++) {
                        System.out.print(array2D[k][l] + " " );
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] array2D = {
                {01, 02, 03, 04, 05, 06, 07, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24, 25, 26, 27},
                {28, 29, 30, 31, 32, 33, 34, 35, 36},
                {37, 38, 39, 40, 41, 42, 43, 44, 45},
                {46, 47, 48, 49, 50, 51, 52, 53, 54},
                {55, 56, 57, 58, 59, 60, 61, 62, 63},
                {64, 65, 66, 67, 68, 69, 70, 71, 72},
                {73, 74, 75, 76, 77, 78, 79, 80, 81}
        };

          sudokus(array2D);
    }


}
