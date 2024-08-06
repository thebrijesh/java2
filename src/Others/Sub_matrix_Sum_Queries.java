package Others;

import java.util.Map;

public class Sub_matrix_Sum_Queries {
    private static void Sub_matrix_Sum_Queries(int[][] arr, int[] B, int[] C, int[] D, int[] E){
//        for (int q = 0; q<B.length; q++){
//            int sum = 0;
////            System.out.println(B[q]+ " "+ D[q]+ " "+C[q]+" "+E[q]);
//            for (int i = B[q]-1; i <= D[q]-1; i++) {
////                System.out.print(i+" ");
//                for (int j = C[q]-1; j <= E[q]-1; j++) {
////                    System.out.print(j+" ");
//                   sum+= arr[i][j];
////                    System.out.print(arr[i][j]+" ");
//                }
//
////                System.out.println();
//            }
//            System.out.print(sum + " ");
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0]+" ");
            for (int j = 1; j < arr[i].length; j++) {

                arr[i][j]+= arr[i][j-1];
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
        System.out.println("---------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0]+" ");
            for (int j = 1; j <arr[i].length; j++) {

                arr[j][i]+= arr[j-1][i];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

      

    }

    public static void main(String[] args) {
        int[][] arr = {{2, 3}, {4}, {7, 8, 9}};
        int[][] A = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 8, 6, 7, 3},
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5}
        };

        int[] B1 = {1, 2};
        int[] C1 = {1, 2};
        int[] D1 = {2, 3};
        int[] E1 = {2, 3};
        Sub_matrix_Sum_Queries(A,B1, C1, D1, E1);

    }
}
