
public class MaximumElementsInArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 2, 5, 8, 1 };
        System.out.println(MaximumNumber(arr));

    }

    public static int MaximumNumber(int[] arr) {
        int Largest = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }
        return Largest;
    }
}
