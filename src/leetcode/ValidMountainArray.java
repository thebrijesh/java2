package leetcode;

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] arr = {1,10,8,3,4};
        System.out.println(validMountainArrays(arr));
    }
    public static boolean validMountainArrays(int[] arr) {
        if(arr.length < 3) return false;
        int l = 0;
        int r = arr.length - 1;
        while(l < arr.length -1 && arr[l] < arr[l + 1]){
            l++;
        }
        while(r  > 1 && arr[r] < arr[r - 1]) {
            r--;
        }
        return l == r;
    }
    public static boolean validMountainArray(int[] arr)  {
        int a = 0;
        int b = 0;
        int flag = 0;
        int flag1 = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && flag == 0) {
                a++;
            } else if (arr[i] < arr[i - 1] && flag1 == 0) {
                b++;
                flag = 1;
            } else {
                return false;
            }
        }
        if(a==0 || b ==0){
            return false;
        }
        if (a + b +1 == arr.length) {
            return true;
        }

        return false;
    }
}
