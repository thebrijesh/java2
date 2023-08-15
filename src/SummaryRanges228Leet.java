import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228Leet {
    public static void summaryRanges(int[] arr) {
        List<String> list = new ArrayList<>();
        int start = 0; int value = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                if(start==0){
                    list.add(arr[start]+"->"+arr[i-1]);
                }else {
                    list.add(arr[start-1]+"->"+arr[i-1]);
                }

                start = arr[i];
            }
            value = arr[i];
        }

        for (String nums:list) {
            System.out.println(nums);
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 6};
        summaryRanges(arr);
    }
}
