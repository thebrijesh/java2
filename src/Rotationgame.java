public class Rotationgame {
//    if customize rotation of array(means b time rotation) so need to different way to reverse  of arr.
//    first of make a reverse method. this method take an int arr and startPoint and endPoint (means give number from where to where).
//    make rotateArray method this method works rotation b time(b means by user input time)
//    this method call reverse method three time. because reverse method works reverse from where to where;
//    call reverse method to first time reverse all elements of array;
//    call the second time of reverse method reverse array elements of 0 to b-1;
//    call the third time of reverse method reverse array elements of b to n(n = arr.length-1);
    private static void rotateArray(int[] arr, int b){
        int n = arr.length-1;
        b = b%(n+1);
        reverseArry(arr,0,n);
        reverseArry(arr,0,b-1);
        reverseArry(arr,b,n);

    }
    private static void reverseArry(int[] arr, int startPoint, int endPoint) {
        int temp;
        for (int i = startPoint; i < endPoint; i++) {
            temp = arr[i];
            arr[i] = arr[endPoint];
            arr[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 6};
       rotateArray(arry,98);
    }
}
