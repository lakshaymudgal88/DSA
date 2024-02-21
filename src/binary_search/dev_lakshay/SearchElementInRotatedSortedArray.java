package binary_search.dev_lakshay;

public class SearchElementInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 2, 5, 8, 10};
        int key = 1;
        int index = searchElement(arr, key);
        System.out.println(index);
    }

    private static int searchElement(int[] arr, int key) {
        int minIndex = searchMinElement(arr);
        int searchInFirstHalf = searchInHalf(arr, 0, minIndex - 1, key);
        int searchInSecondHalf = searchInHalf(arr, minIndex, arr.length - 1, key);
        if (searchInFirstHalf != -1) {
            return searchInFirstHalf;
        }
        return searchInSecondHalf;
    }

    private static int searchInHalf(int[] arr, int start, int end, int key) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int searchMinElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int pre = (mid + arr.length - 1) % arr.length;
            int next = (mid + 1) % arr.length;
            if (arr[mid] <= arr[pre] && arr[mid] <= arr[next]) {
                return mid;
            } else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
