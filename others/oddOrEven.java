package others;

/**
 * oddOrEven
 */
public class oddOrEven {
    public static void main(String[] args) {
        int n = 34;
        // normal odd or even
        // if (n % 2 == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("Odd");
        // }
        String[] arr = new String[] { "even", "odd" };
        System.out.println(arr[n & 1]);// here we get element by on basis of index value
        // bitwise and operator => & it returns either 0 or 1
    }

    // with out using any if statement or modulus operator

    // using binary numbers
    // 0010 => 2;

    // if the n is even is last number of binary representation is always 0
    // if the n is odd is last number of binary representation is always 1

    // ex:
    // n = 3;
    // 3 => 11

    // n = 4;
    // 100

}