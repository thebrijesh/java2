package leetcode;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        int[] arr = new int[129];
        char[] ss = s.toCharArray();
        for (var ch : t.toCharArray()) {
            arr[ch]++;
        }
        int count = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        String str = "";
        for (int i = 0; i < ss.length; i++) {
            if (arr[ss[i]] == 1) {
                count++;
                if (count == 1) {
                    start = i;
                }
            }
            if (arr[ss[i]] > 1){
                arr[ss[i]]--;
            }
            if (count == t.length()) {
                end = i;
                if ((end - start) + 1 < min) {
                    str = s.substring(start, end + 1);
                    min = (end - start) + 1;
                }

                count = 0;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
