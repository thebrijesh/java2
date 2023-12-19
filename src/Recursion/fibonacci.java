package Recursion;

public class fibonacci {

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
      int pre =   fibo(n-1);
      int prepre =   fibo(n-2);




        return pre + prepre;

    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(fibo(i));
//        }

        System.out.println(fibo(4));

    }
}
