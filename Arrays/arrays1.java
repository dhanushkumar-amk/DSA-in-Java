package Arrays;

// syntax =>
// datatype[] variable_Name = new datatype[size];

// int[] arrays = new int[5];

// int[] ros;
// declaration of arrays , ros is getting defined in the stack

// array objet are in heap
// heap objects are not continues
// array object in java is not continues because of jvm

// print(arr[0]); => is a index of 0

// new keyword are used to create an object

// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        // String[] arr = new String[4];
        // System.out.println(arr[0]);
        Scanner s = new Scanner(System.in);
        // input an element in array

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 34;
        arr[3] = 74;
        arr[4] = 84;
        // System.out.println(arr[3]);
        // 74

        // input using for loop

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = s.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }

        // ? Enhanced for loop
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }

        // another ,Method
        // ! System.out.println(Arrays.toString(arr));

        // arrays of objects
        String[] str = new String[5];
        for (int i = 0; i < arr.length; i++) {
            str[i] = s.next();
        }
        System.out.print(Arrays.toString(str));
    }
    // null
    // String str = null;
    // reference variables is by default null
    // null is a special value by default to null for reference variable

    // int num = null;

}
