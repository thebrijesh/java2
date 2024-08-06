package leetcode;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int istart = 0;
        int iend = matrix.length - 1;
        int imid = 0;
        while (istart < iend) {
            imid = istart + (iend - istart) / 2;
            if (matrix[imid][0] == target || matrix[imid][matrix[imid].length - 1]==target) {
                return true;
            } else if (matrix[imid][0] < target) {
                istart = imid;
            } else {
                iend = imid - 1;
            }


        }

        int start = 0;
        int end = matrix[imid].length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (matrix[imid][mid] == target) {
                return true;
            } else if (matrix[imid][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

        public static boolean searchMatrix1(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int left = 0, right = m * n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int mid_val = matrix[mid / n][mid % n];

                if (mid_val == target)
                    return true;
                else if (mid_val < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return false;
        }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        System.out.println(searchMatrix1(arr, 10));
    }
}
