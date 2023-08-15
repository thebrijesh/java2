package GFG;

public class OperatingAnArray {

    public static void main(String[] args) {

    }

    public boolean searchEle(int a[], int x) {
        for (var num : a) {
            if (x == num) {
                return true;
            }
        }
        return false;
    }

    public boolean insertEle(int a[], int y, int yi) {


        if (yi > a.length) {
            return false;
        }
        a[yi] = y;
        return true;
    }

    public boolean deleteEle(int a[], int z) {
        return true;
    }
}
