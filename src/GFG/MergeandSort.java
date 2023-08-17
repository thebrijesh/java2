package GFG;

public class MergeandSort {
    public static int mergeNsort(int a[], int b[], int n, int m, int answer[]) {
        int[] arr = new int[1000000];
        for (int i = 0; i < a.length; i++) {
            arr[a[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            arr[b[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx] = i;
                idx++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return idx;
    }

    public static void main(String[] args) {
        int arr1[] = {1,8,9};
        int arr2[] = {10,11,12};
        int answer[] = new int[arr1.length + arr2.length];
        System.out.println(mergeNsort(arr1, arr2, 5, 8, answer));

    }
}
