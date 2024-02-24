package binary_search.dev_lakshay;

public class FloorOfAnElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10, 15, 23, 25};
        int key = 22;
        int floorElement = floorOfAnElement(arr, key);
        System.out.println(floorElement);
    }

    /**
     * start = 0, 4, 5, 5,
     * end = 7, 7, 7, 5,
     * mid = 3, 5, 6, 5,
     * res = -1, 7,
     * 20 == 7, false, 20 == 15, false, 20 == 23, false, 20 == 15, false
     * 20 <= 7, false, 20 <= 15, false, 20 <= 23, true, end = mid - 1(5), 20 <= 15, false
     * 20 > 7, true, start = mid + 1 (3 + 1 = 4), res = arr[mid](7),
     * 20 > 15, true, start = mid + 1 (4 + 1 = 5), res = arr[mid](15)
     */
    private static int floorOfAnElement(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                return arr[mid];
            } else if (key <= arr[mid]) {
                end = mid - 1;
            } else {
                res = arr[mid];
                start = mid + 1;
            }
        }
        return res;
    }
}
