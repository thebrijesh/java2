package GFG;

public class ReplaceAll0sWith5 {
    public static int convertfive(int num) {
        int multi = 1; int ans =0; int noChange = num;
        int value = num;
        for (int i = 0; i < num; i++) {
            ans=num%10;
            num = num/10;

            if (ans == 0){
                value  = value + (5 * multi);

            }
            multi  = multi * 10;
        }

        return value;
    }

    public static void main(String[] args) {
        int num = 1004;
        System.out.println(convertfive(num));
    }
}
