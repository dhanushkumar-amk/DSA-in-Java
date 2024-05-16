public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        int m = 3;
        int n = 3;

        MergeSorted(nums1, nums2, m, n);
        for (int j = 0; j < m + n; j++) {
            System.out.print(nums1[j] + " ");
        }

    }

    public static void MergeSorted(int[] nums1, int[] nums2, int m, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;

            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }

        }
    }
}
