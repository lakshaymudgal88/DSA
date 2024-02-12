package binary_search.dev_lakshay;

public class NoOfTimesArrayRotated {

    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 21, 22, 25, 1};
        int rotatedTimes = sortedArrayRotated(arr);
        System.out.println(rotatedTimes);
    }

    private static int sortedArrayRotated(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end])
            return 0;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int next = (mid + 1) % arr.length;
            int pre = (mid + arr.length - 1) % arr.length;
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
