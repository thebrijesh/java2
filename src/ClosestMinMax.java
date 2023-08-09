public class ClosestMinMax {
// found min amd max value and store separate variable.
//    traverse array and found indexes of which stored min and max values
//    and stored other separate variable.
//    return differences of indexes.
    public static void closetminmax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
int imin = 0; int imax = 0; int totalmax = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == min){
                imin = i;
            }
            if (arr[i] == max){
                imax = i;
            }

            if (imin!=0 && imax != 0){
            totalmax = Math.min(totalmax,Math.abs(imin-imax)+1);
        }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(totalmax);

    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 6, 9,6,1,9};
        closetminmax(arr);
    }
}
