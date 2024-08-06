package Others;

public class PickFromBothSides {
//    in this programme pick elements both sides of array.
//    so first prefix sum of array.
//    make 2 size of array for return.
//
    public static void pickBoth(int[] arr,int B){
        int sum = 0; int max = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];

        }

        for (int i = 0; i <B; i++) {
            int j =B-i;
            if(i==0){
                sum = arr[arr.length-1]- arr[(arr.length-1)-B-i];
            } else if (j==0) {
                sum = arr[i-1];
            }else {
                sum = arr[arr.length-1]- arr[(arr.length-1)-B-i] + arr[i-1];
            }

            max = Math.max(max,sum);
        }

        System.out.println(sum);
        Rotationgame.printArray(arr);
    }


    public static void pickBoth1(int[] arr,int[][] B){
        int sum = 0; int max = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];

        }
        Rotationgame.printArray(arr);
int[] narr = new int[2];
        for (int i = 0; i <B.length; i++) {

          if (B[i][0]==0){
              sum = arr[B[i][1]];
              narr[i] = sum;
          }else {
              sum = arr[B[i][1]]-arr[B[i][0]-1];
              narr[i] = sum;
          }



        }



        Rotationgame.printArray(narr);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] b = {{0,3},{1,2}};
        pickBoth1(arr,b);
    }
}
