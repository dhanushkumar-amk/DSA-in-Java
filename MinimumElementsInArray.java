
public class MinimumElementsInArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 2, 5, 8, 1 };
        System.out.println(MinimumNumber(arr));

    }

    public static int MinimumNumber(int[] arr) {
        int smallest = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
