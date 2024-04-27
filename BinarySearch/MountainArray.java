package BinarySearch;

// leetCode 1095
// https://leetcode.com/problems/find-in-mountain-array/description/
public class MountainArray {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != 1) {
            return firstTry;

        }
        // ty to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // your are decreasing path of an array
                // this is why end = mid -1;
                end = mid;
            } else {
                // ascending part of an array
                start = mid + 1;
            }
        }
        // / start is == end and pointing largest element
        // start and end are always used to find largest elements
        return start;
    }

    public static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // int start = 0;
        // int end = arr.length - 1;

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
