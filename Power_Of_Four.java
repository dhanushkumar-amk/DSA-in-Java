
public class Power_Of_Four {

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        while (n > 1 && n % 4 == 0) {
            n = n / 4;
        }
        return n == 1 ? true : false;
    }
}