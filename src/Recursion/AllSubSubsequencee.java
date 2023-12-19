package Recursion;

import java.util.ArrayList;

public class AllSubSubsequencee {
    static ArrayList<String> getssq(String s) {
        ArrayList<String> str = new ArrayList<>();

        if (s.length() == 0) {
            str.add("");
            return str;
        }

        char curr = s.charAt(0);
        System.out.println(curr);

        ArrayList<String> smallAns = getssq(s.substring(1));
        System.out.println("smallAns: "+smallAns);

        for (var ss : smallAns) {
            str.add(ss);
            str.add(curr + ss);
            System.out.println("str: "+str);
        }
        return str;
    }
    public static char value = '"';
    static void fun(String s, String curAns){
        if (s.isEmpty()){
            System.out.println("ans: "+ value + curAns+ value);
            return;
        }
        char ch = s.charAt(0);
        System.out.println("currChar: "+ value +ch+ value);
        String remString = s.substring(1);
        System.out.println("remString: " + value + remString + value + " || " + "curAns+ch: " + value +curAns + value+ " + "+ value+ch+ value);
        fun(remString,curAns + ch);
        System.out.println("remString: "+ value + remString+ value + " || " + "curAns: "+ value +curAns+ value);
        fun(remString,curAns );
    }

    static int best(int[] h, int n, int idx){
        if(idx == n-1) return 0;
        int op1 = Math.abs(h[idx + 1] - h[idx]) + best(h,n,idx+1);
        if(idx == n-2)return op1;
        int op2 = Math.abs(h[idx + 2] - h[idx]) + best(h,n,idx+2);
        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
//        getssq("abcde");
//        fun("abc","");
        int[] arr = {10,30,40,20};
        System.out.println(best(arr, 4, 0));
    }
}
