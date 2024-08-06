package Others;

public class SortedMatrix {

//    initialized the variable
//            raw = 0 , sum = 0, lastIndex = arr.length-1; given arr and target
//    declare the first loop -> check lastIndex of each raw is bigger than and equels the target so add a position in lastIndex variable.
//
//    declare the second loop -> iteration of column in lastIndex raw.
//    and search target variable value if meet so apply this condition of sum sum = (raw + 1) * 1009 + (k + 1);
    private static void sortedMatrix(int[][] arr, int target) {

        int raw = 0;
        int sum = 0;
      int lastIndex = arr.length - 1;

      for (int k = 0; k < arr.length; k++) {
          if (arr[k][lastIndex] >= target) {
                raw = k;
                break;
          }
        }

        for (int k = 0; k < arr[raw].length; k++) {
            if (target == arr[raw][k]) {
                sum = (raw + 1) * 1009 + (k + 1);
                break;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        sortedMatrix(arr, 5);
    }
}
