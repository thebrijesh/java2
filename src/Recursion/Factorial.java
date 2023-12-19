package Recursion;

public class Factorial {

    public static int facto(int n) {
        if (n == 0) {
            return 1;
        }
        int f = facto(n - 1);
        int ans = f * n;
        System.out.println(ans);
        return ans;
    }

    public static int gcd(int a , int b){
        if (b == 0)return a;
        int mod = a%b;
        return gcd(b,mod);
    }

    public static void main(String[] args) {
        facto(5);
        gcd(15,27);
    }
}
