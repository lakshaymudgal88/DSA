package binary_search.dev_lakshay;

public class LastOccuranceOfElement {

    public static void main(String[] args) {
        int[] arr = {1,1,3,5,6,9,9,9,9,12,14,16};
        int key = 1;
        int index = indexOfLastOccuranceOfElement(arr, key);
        System.out.println(index);
    }

    private static int indexOfLastOccuranceOfElement(int[] arr, int key) {
        int result = -1;
        int start = 0;
        int end = arr.length - 1;
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
}
