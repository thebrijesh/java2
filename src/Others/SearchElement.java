package Others;

public class SearchElement {
    private static int searchElement(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start <= end) {
            int mid = start + (end -start)/2;
            if (mid == target) {
                return 1;
            } else if (mid < target) {

                start = mid +1;
            }else {
                end = mid -1;

            }


        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 6};
        System.out.println(searchElement(arry,2));
    }
}
