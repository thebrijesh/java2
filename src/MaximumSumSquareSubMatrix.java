public class MaximumSumSquareSubMatrix {

//    declare the first loop -> the first loop calculate the sum of raw.(in 2D array )
//    declare the second loop -> the second loop calculate the sum of colum.(in 2D array)
//    declare the third loop -> this loop search max sum of 2D array. (given N X N array and Find B X B )
//                           -> this loop both itrator start b-1.(raw and col)(i,j)
//                           -> check condition raw and col both equal to b-1 so add value of raw and col in maxSum variable;
//                           -> raw is equal to b-1 so raw and col value is raw and col-b minus in raw and col.
//                              add value of raw and col in maxSum variable.
//                           -> col is equal to b-1 so raw and col value is raw-b and col minus in raw and col.
//                              add value of raw and col in maxSum variable.
//                           -> check condition raw and col both equal to b-1 so raw and col value is (raw and col-b) - (raw-b and col) minus in raw and col.
//                           -> and plus raw-b and col -b.add value of raw and col in maxSum variable.
    private static void maximumSumSquareSubMatrix(int[][] arr,int b){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0]+" ");
            for (int j = 1; j < arr[i].length; j++) {

                arr[i][j]+= arr[i][j-1];
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0]+" ");
            for (int j = 1; j <arr[i].length; j++) {

                arr[j][i]+= arr[j-1][i];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         int maxSum = 0;

        for (int raw = b-1; raw < arr.length; raw++) {
            for (int col = b-1; col < arr[raw].length; col++) {
                if (raw==b-1  && col == b-1){
                   maxSum =  Math.max(maxSum,arr[raw][col]);
                } else if (raw ==b-1) {

                    arr[raw][col] = arr[raw][col]-arr[raw][col-b];
                    maxSum = Math.max(maxSum,arr[raw][col]);
                } else if (col == b-1) {

                    arr[raw][col] = arr[raw][col]-arr[raw-b][col];
                    maxSum = Math.max(maxSum,arr[raw][col]);

                }else {

                    arr[raw][col] = arr[raw][col]-arr[raw][col-b]-arr[raw-b][col];
                    arr[raw][col] = arr[raw][col]+arr[raw-b][col-b];
                    maxSum = Math.max(maxSum,arr[raw][col]);
                }

            }

        }
        System.out.println(maxSum);
    }



    public static void main(String[] args) {
        int[][] A = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 8, 6, 7, 3},
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5}
        };
        int b = 3;
        maximumSumSquareSubMatrix(A,b);
    }
}
