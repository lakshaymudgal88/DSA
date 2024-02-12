package binary_search.dev_lakshay;

public class IndexOfElementInAscSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10,15,23,25};
        int key = 1;
        int index = indexOfSpecificElementInAsc(arr, key);
        System.out.println(index);
    }

    private static int indexOfSpecificElementInAsc(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return -1;
    }
}
