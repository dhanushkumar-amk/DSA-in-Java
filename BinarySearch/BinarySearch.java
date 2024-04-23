package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        // binary search are used to search the faster than other method
        // it consists of starting point and middle point and end point
        int arr[] = { -17, -1, 0, 1, 2, 3, 4, 5, 6, 7, 17, 56, 88, 99 };
        int target = 17;
        int ans = BinarySearch1(arr, target);
        System.out.println(ans);
    }

    // return the index
    // if does not exit then return -1
    static int BinarySearch1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle elements
            // int mid = (start + end)/2;

            // might be possible exists th range of the value
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                // if target == mid then return middle element
                return mid;
            }
        }
        return -1;
    }
}
