
// count the no of digits in the number
// n =  1234567890  output : 10

public class countthedigits {
    public static void main(String[] args) {
        int n = 1234534;
        int count = 0;
        while (n > 0) { // if n greater than 0
            n = n / 10; // then n = n / 10; 12345/10 = 1234 repeat until its become 0
            count++;// then add 1 to count ;
        }
        System.out.println(count);
    }

}
// output
/// 7