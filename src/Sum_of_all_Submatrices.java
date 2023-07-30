public class Sum_of_all_Submatrices {
    public static void pseudocode(){
// take a variable and after take a for loops i and j for 2D matrix.
// sum all sub-matrix and store in variable and check condition raw size is not equal column size so return;
    }
    public static void Sum_of_all_Submatrices(int[][] arr){
        int sum = 0;
int multi = arr.length * 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length !=arr.length ) {
                    System.out.println("In valid input");
                    return;
                }
                sum += arr[i][j]*multi;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[][] A2 = { { 1, 2 },
                { 3, 4 } };
        Sum_of_all_Submatrices(A2);
    }
}
