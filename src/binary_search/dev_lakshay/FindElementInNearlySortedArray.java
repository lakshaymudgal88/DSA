package binary_search.dev_lakshay;

public class FindElementInNearlySortedArray {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10,15,23,25};
        int key = 23;
        int finalIndex = searchInNearlySortedArray(arr, key);
        System.out.println(finalIndex);
    }

    private static int searchInNearlySortedArray(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                return mid;
            } else if (start <= mid && key == arr[mid - 1]) {
                return mid - 1;
            } else if (mid <= end && key == arr[mid] + 1) {
                return mid + 1;
            } else if (key <= arr[mid]) {
                end = mid - 2;
            } else {
                start = mid + 2;
            }
        }
        return -1;
    }
}
