package BinarySearch;

// the given array iss sorted but you don't have idea is ASCENDING   order or DESCENDING order

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 88, 77, 66, 55, 44, 33, 22, 11, 0, -11, -22, -33 };
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans); // Expected output: 6
    }

    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Determine if the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Handling descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found in the array
    }
}
