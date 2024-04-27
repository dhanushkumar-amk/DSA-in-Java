package BinarySearch;
// sorted array apply binary search

// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/ 

// leetCode 852
// the same answer for leetCode 162
public class peakIndexInAMountainArray {
    public static void main(String[] args) {

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
}
