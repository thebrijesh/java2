package leetcode;

public class FindPositiveInteger {

    public static int binarySearch1(int i, int z){
        int start = 1;
        int end = 1000;
        int customfunction = 0;

        while (start <= end) {
            int fmid = start + (end - start) / 2;
            if (i + fmid == z) {
                return fmid;
            } else if (fmid + i < z) {
                start = fmid + 1;
            }else {
                end = fmid - 1;
            }
        }
        return 0;
    }

    public static int main(String[] args) {
        int z = 0;
        int customfunction = 0;

        for (int i = 1; i <= 1000; i++) {

            int start = 1;
            int end = 1000;
            int fmid = 0;

            while (start <= end) {
                fmid = start + (end - start) / 2;
                if (i + fmid == z) {
                    return fmid;
                } else if (fmid + i < z) {
                    start = fmid + 1;
                }else {
                    end = fmid - 1;
                }
            }
        }
        return 0;
    }
}
