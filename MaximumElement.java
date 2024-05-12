public class MaximumElement {

    public static void main(String[] args) {
        int n[] = { 2, 3, 4, 85, 6, 7, 8 };
        System.out.println(MaximumElementOfArray(n));

    }

    public static int MaximumElementOfArray(int[] n) {
        int largestNumber = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > largestNumber) {
                largestNumber = n[i];
            }

        }
        return largestNumber;
    }
}