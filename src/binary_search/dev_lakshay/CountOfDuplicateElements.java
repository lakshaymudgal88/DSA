package binary_search.dev_lakshay;

public class CountOfDuplicateElements {

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 5, 7, 7, 7, 7, 10, 12};
        int key = 7;
        int count = countOfElements(arr, key);
        System.out.println(count);
    }

    private static int countOfElements(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int startIndex = indexOfFirstOccurance(arr, start, end, key);
        int endIndex = indexOfLastOccurance(arr, start, end, key);
        if (startIndex == -1 && endIndex == -1) {
            return 0;
        } else {
            return (endIndex - startIndex) + 1;
        }
    }

    private static int indexOfLastOccurance(int[] arr, int start, int end, int key) {
        int result = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                result = mid;
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    private static int indexOfFirstOccurance(int[] arr, int start, int end, int key) {
        int result = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                result = mid;
                end = mid - 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
