package Recursion;

public class SumOfIntegers {

    public static int sumInt(int n){
        int sum = 0;
        if (n >= 0 && n <= 9){

            return 1;
        }
        int ans  = sumInt(n/10);


        sum = ans +n%10;
        return sum;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumInt(n));
    }
}
