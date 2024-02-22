package binary_search.dev_lakshay;

public class FloorOfAnElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10, 15, 23, 25};
        int key = 20;
        int floorElement = floorOfAnElement(arr, key);
        System.out.println(floorElement);
    }

    private static int floorOfAnElement(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                return arr[mid];
            } else if (key <= arr[mid]) {
                res = arr[mid - 1];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
