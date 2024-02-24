package binary_search.dev_lakshay;

public class CeilOfAnElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10, 15, 23, 25};
        int key = 26;
        int ceilElement = ceilOfAnElement(arr, key);
        System.out.print(ceilElement);
    }

    /**
     * start = 0, 4, 5, 5, 6, 6,
     * end = 7, 7, 7, 6, 6, 5,
     * mid = 3, 5, 6, 5, 6,
     * res = -1, -1, -1, 23,
     * 20 == 7, false, 20 == 15, false, 20 == 23, false, 20 == 15, false, 20 == 23, false
     * 20 <= 7, false, 20 <= 15, false, 20 <= 23, true, res = 23, end = mid - 1, 20 <= 15, false, 20 <= 23, true, res = 23, end = mid - 1
     * 20 > 7, true, start = mid + 1, 20 > 15, true, start = mid + 1, 20 > 15, true, start = mid + 1
     */

    private static int ceilOfAnElement(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                return arr[mid];
            } else if (start <= mid && key <= arr[mid]) {
                res = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
