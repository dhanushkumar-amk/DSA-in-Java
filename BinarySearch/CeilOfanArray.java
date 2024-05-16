package BinarySearch;

public class CeilOfanArray {
    public static void main(String[] args) {
        int arr[] = { -17, -1, 0, 1, 2, 3, 4, 6, 7, 17, 56, 88, 99 };
        int target = 5;
        int ans = ceil(arr, target);
        System.out.println(ans);

    }

    public static int ceil(int[] arr, int target) {
        // binary search
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        if (end <= arr.length) {
            return arr[start];
        } else {
            return -1;
        }

    }
}
