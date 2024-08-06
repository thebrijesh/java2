package leetcode;

public class NthMagicalNumber {

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int nthMagicalNumber(int n, int a, int b) {
        long l = Math.min(a, b);
        long r = (long) Math.min(a, b) * n;
        long lcm = (long) a * b / gcd(a, b);
        while (l < r) {
            long m = (l + r) / 2;
            if (m / a + m / b - m / lcm >= n)
                r = m;
            else
                l = m + 1;
        }

        return (int) (l % 10000007);
    }
    public static void main(String[] args) {
    int an = 5,a = 2,b = 3;
    nthMagicalNumber(an,a,b);
    }
}
