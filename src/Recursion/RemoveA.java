package Recursion;

public class RemoveA {

    static String removeA1(String str){
        if (0 == str.length()) {
            return "";
        }
        String sans;
        sans = removeA1(str.substring(1));
        char currchar = str.charAt(0);

        if (currchar != 'a'){
            return currchar + sans;
        }else {
            return sans;
        }
    }

    static String removeA(String str, int idx, String ans) {
        if (idx == str.length()) {
            return ans;
        }
        if (str.charAt(idx) != 'a') {
            ans += str.charAt(idx);

        }
        String sans = "";
        sans = removeA(str, idx + 1, ans);
        return sans;
    }

    public static void main(String[] args) {
        System.out.println(removeA("aaavaaab", 0, ""));
        System.out.println(removeA1("aaavaaab"));
    }
}
