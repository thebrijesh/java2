package leetcode;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count = 0;
        int zcount = 0;
        int i = 0;
        int ans = 0;

        if (n < 0) {
            int m = Math.abs(n);
            while (m > 0) {
                int remainder = m % 2;

                if (remainder == 1) {
                    count++;
                }
                if (count >= 1 && remainder == 0) zcount++;

                m /= 2;
                i++;
            }
            ans = (33 - i) + zcount;

            return ans;
        } else {
            while (n > 0) {
                int remainder = n % 2;
                if (remainder == 1) count++;
                n /= 2;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        int n = -21;
        System.out.println(hammingWeight(n));
    }
}
