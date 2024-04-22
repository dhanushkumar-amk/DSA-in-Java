package others;

public class sumOfEvenOddDigits {
    public static void main(String[] args) {
        int n = 2424244;
        SumOfOddAndEven(n);
    }

    private static void SumOfOddAndEven(int n) {
        int SumOfOddDigits = 0;
        int SumOfEvenDigits = 0;

        while (n != 0) {
            int temp = n;
            temp = temp % 10;
            if (temp % 2 != 0) {
                SumOfOddDigits = SumOfOddDigits + temp;

            } else {
                SumOfEvenDigits = SumOfEvenDigits + temp;
            }
            n = n / 10;

        }

        System.out.println(SumOfOddDigits + " Odd");
        System.out.println(SumOfEvenDigits + " Even ");

    }
}
