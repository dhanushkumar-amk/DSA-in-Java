
 // find maximum value

// Question
// find the maximum value in the array
// int[] num = { 20, 70, 80, 90, 10, 100 };
// expected output:
// 100

// output:
// 100

public class findMaximumNumber {

public static void main(String[] args) {
    int[] num = { 20, 70, 80, 90, 10, 100 };
    System.out.println(man(num));
}

// assume array length is o
// return the minimum value in an array

static int man(int[] num) {
    int ans = num[0];
    for (int i = 0; i < num.length; i++) {
// if the current value is overall less than other number return that value
        if (num[i] > ans) {
            ans = num[i];
        }
    }
    return ans;
}

}



