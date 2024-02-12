package binary_search.dev_lakshay;

public class FirstOccurranceOfElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 8, 8, 9, 10};
        int key = 9;
        int index = firstOccuranceofElement(arr, key);
        System.out.println(index);
    }

    private static int firstOccuranceofElement(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
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
