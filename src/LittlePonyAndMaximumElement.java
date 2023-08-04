public class LittlePonyAndMaximumElement {
//   check (search) target is available in the array(By for each loop)
//   is true so return how many values in the array less than target.(by for each loop)
//    return -1;
    private static int maxele(int[] arr, int target) {
        boolean flag = false;
        for (int num : arr) {
            if (num == target) {
                flag = true;
                break;
            }
        }
        if (flag) {
            int count = 0;
            for (int num : arr) {
                if (num < target) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arry = {2, 4, 3, 1, 5};
        System.out.println(maxele(arry, 3));
    }
}
