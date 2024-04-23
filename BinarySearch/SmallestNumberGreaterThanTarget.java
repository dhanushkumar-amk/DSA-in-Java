package BinarySearch;

// leetCode 744

public class SmallestNumberGreaterThanTarget {
    /**
     * @param args
     */
    public static void main(String[] args) {
        char letters[] = { 'x', 'x', 'x', 'y', 'y' };

        char target = 'z';
        int ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle elements
            // int mid = (start + end)/2;

            // might be possible exists th range of the value
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return letters[start % letters.length];
    }
}
