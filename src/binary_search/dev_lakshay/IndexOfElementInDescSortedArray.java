package binary_search.dev_lakshay;

public class IndexOfElementInDescSortedArray {

    public static void main(String[] args) {
        int[] arr = {12,10,9,8,5,3,2,1};
        int key = 1;
        int index = indexOfSpecificElementInDesc(arr, key);
        System.out.println(index);
    }

    private static int indexOfSpecificElementInDesc(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
