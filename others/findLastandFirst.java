package others;

public class findLastandFirst {
    public static void main(String[] args) {

        int n = 52345678;
        FindNumber(n);
    }

    static void FindNumber(int n) {
        int lastNumber = 0;
        int firstNumber = 0;

        lastNumber = n % 10;
        System.out.println("The last Number is " + lastNumber + " ");

        while (n != 0) {
            firstNumber = n;
            n /= 10;

        }
        System.out.println("The First Number is " + firstNumber + " ");

    }
}
