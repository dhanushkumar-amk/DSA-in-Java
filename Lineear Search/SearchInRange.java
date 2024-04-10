
// Search in range

// question
// int[] num = {20,60,40,70,80,90,100};
// the given index array search the element in between the index 1 to index 3 if element present return true , not present return false


public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {20,60,40,70,80,90,100};
int target = 70;
boolean ans = mylinearSearch4(num, target, 1, 3);
System.out.println(ans);

}
static boolean mylinearSearch3(int[] arr, int target){
    // if an array is empty return null or -1 
    if(arr.length == 0){
        return false;
    }
    // run for loop

    // only we change is starting index of i and condition which whatever the index is finish
    for (int index = 1; index <= 3; index++) {
        // Check an element of an every index of an array the target element is present
        int element = arr[index];
        if(element == target){
            return true;
        }  
        
    }

    //  this line execute if null of the return statement if target not found
return false;
} 

// ? ================================================================================== ****************** ============================================================================================================================================================================================================================================================================================================================== //

// custom range by user
// just add start and end

static boolean mylinearSearch4(int[] arr, int target, int start, int end){
    // if an array is empty return null or -1 
    if(arr.length == 0){
        return false;
    }
    // run for loop

    // only we change is starting index of i and condition which whatever the index is finish
    for (int index = start; index <= end; index++) {
        // Check an element of an every index of an array the target element is present
        int element = arr[index];
        if(element == target){
            return true;
        }  
        
    }

    //  this line execute if null of the return statement if target not found
return false;
} 
}
