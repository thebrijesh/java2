public class ReverseArrayInGroups {
    //    geeks for geeks


    public static void reverseArray(int[] arr, int k) {
        int start = 0;
        int end = k;
        int temp = 0;
        int b = k;
        boolean flag = false;
        if(k > arr.length){
            end = arr.length;
        }

        for (int i = 0; i < arr.length; i++) {

            if (start < end) {
                temp = arr[start];
                arr[start] = arr[end - 1];
                arr[end - 1] = temp;
                start++;
                end--;
            } else {
                if (!flag) {
                    if (k + b <= arr.length) {
                        start = k;
                        k = k + b;
                        end = k;
                    } else {
                        start = k;
                        end = arr.length;
                        flag = true;
                    }
                } else {
                    break;
                }

            }
        }
        Rotationgame.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int k = 18;

        reverseArray(arr, k);
    }
}
