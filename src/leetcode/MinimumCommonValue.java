package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
int ans =-1;
        for (var num:nums1) {
            set.add(num);

        }
        System.out.println(set);

        for (var num:nums2) {
            if(set.contains(num)){
                ans =  num;
                break;
            }
        }
        
return ans ;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,6};
        int [] arr2 = {2,3,4,5};
        System.out.println(getCommon(arr,arr2));
    }
}
