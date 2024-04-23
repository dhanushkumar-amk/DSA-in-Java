package BinarySearch;

// ceiling => find the smallest element in array greater than  or equal to the target 

public class ceilingOfANumber {
    public static void main(String[] args) {
        int arr[] = { -17, -1, 0, 1, 2, 3, 4, 6, 7, 17, 56, 88, 99 };
        int target = 5;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    // smallest element in array greater than or equal to the target
    static int Ceiling(int[] arr, int target) {
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
        return start;
    }
}
