package Arrays;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8 };
        System.out.println(RemoveDuplicates(arr));
    }

    public static int RemoveDuplicates(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            } else {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}
