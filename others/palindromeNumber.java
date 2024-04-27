public class palindromeNumber {

    public static void main(String[] args) {
        int number = 111;
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int sum = 0;

        while (number > 0) {
            int remainder = number % 10;
            sum = sum * 10 + remainder;
            number = number / 10;
        }

        if (temp == sum) {
            return true;
        }
        else {
            return false;
        }

    }
}