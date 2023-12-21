package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static List<String> ans = new ArrayList<String>();
    static char value = '"';

    public static void rec(int n, int ob, int cb, StringBuilder s) {
        System.out.println("n: " + n + " ||" + " ob: " + ob + " ||" + " cb: " + cb + " ||" + " str: " + value + s + value);
        if (ob > n || cb > n) {
            return;
        }
        if (n == ob && ob == cb) {
            ans.add(s.toString());
            System.out.println(ans);
            return;
        }
        if (ob > cb) {
            s.append(")");
            rec(n, ob, cb + 1, s);

            s.deleteCharAt(s.length() - 1);
            s.append("(");
            rec(n, ob + 1, cb, s);
            s.deleteCharAt(s.length() - 1);
        } else {
            s.append("(");
            rec(n, ob + 1, cb, s);
            s.deleteCharAt(s.length() - 1);
        }
        return;
    }

    public static List<String> generateParenthesis(int n) {
        StringBuilder temp = new StringBuilder();
        rec(n, 0, 0, temp);
        return ans;
    }

    public static void main(String[] args) {
        generateParenthesis(3);
    }
}
