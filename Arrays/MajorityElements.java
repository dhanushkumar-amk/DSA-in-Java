package Arrays;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 3, 2, 2, 2, 3, 3, 3, 3, 3, 3 };
        int answer = MajorityElement(arr);
        System.out.println(answer);

    }

    public static int MajorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        int element = 0;

        for (int i = 0; i < n; i++) {

            if (count == 0) {
                count++;
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else
                count--;
        }

        int finalCount = 0;

        for (int i = 0; i < n; i++) {
            if (element == arr[i])
                finalCount++;

            if (finalCount > (n / 2))
                return element;
        }
        return -1;
    }
}
