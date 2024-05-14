public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(MissingElements(arr));

    }

    public static int MissingElements(int[] arr) {
        int all = 0;
        for (int i = 0; i <= arr.length; i++) {
            all = all ^ i;
        }
        for (int ar : arr) {
            all = all ^ ar;
        }

        return all;
    }

}
