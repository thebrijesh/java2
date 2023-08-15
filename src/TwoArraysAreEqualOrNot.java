import java.util.HashMap;
import java.util.Map;

public class TwoArraysAreEqualOrNot {
    public static boolean check(long A[],long B[]) {
        Map<Long,Integer> map = new HashMap<>();
        if (A.length!=B.length) return false;
        int big = Integer.MIN_VALUE;
        for (var num: A) {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }


        for (int i = 0; i < B.length; i++) {
            if (!map.containsKey(B[i]) || map.get(B[i]) == 0) {
                return false;
            } else {
                map.put(B[i], map.get(B[i])-1);
            }
        }


        /*for (var num3: map.values()) {
            if (num3>0) return false;
        }*/
        return true;
    }

    public static void main(String[] args) {
       long A[] = {8,9,7,5,3,1};
      long  B[] = {5,4,2,5,1,7};
        System.out.println(check(A,B));
    }
}
