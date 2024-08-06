package Others;

public class SingleNumber {
    public static void singalNumber(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        System.out.println(xor);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,4,5,3,4};
        singalNumber(arr);
    }
}
