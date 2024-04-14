package pproblems;

public class NaturalNumbersUsingRecursion {
    public static void main(String[] args) {
        naturalNumbers(10);
    }

    // printing n numbers using recursion
    public static void naturalNumbers(int n) {
        // base cause
        if (n == 1) {
            System.out.println(1);
        } else {

            // recursion case
            System.out.print(n + " ");
            naturalNumbers(n - 1);
        }

        // 10 9 8 7 6 5 4 3 2 1
    }
}
