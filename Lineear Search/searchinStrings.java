// import java.util.Scanner;


// question
// name = "Dhanushkumar";
// in the  given element search the target element present in the string or not if the element present return true , if the element not present in element return false

public class searchinStrings {

    public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
        // char target;
// System.out.println("Enter the string");
        String name = "Dhanushkumar";
        // Scanner s1 = new Scanner(System.in);
char target = 'u';
        // System.out.println("Element to search");
        // target = s.nextLine();
        System.out.println(searchString(name, target));
    }

    static boolean searchString(String str, char target){
        // if an array is empty return false 

        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            // charAt()  => Returns the char value at the specified index
            // target = index value present then print true
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}

