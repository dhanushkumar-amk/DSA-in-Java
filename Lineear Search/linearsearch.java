


//linear search
// sequential order  one by one 


// ex : problem
// int[] num = {20,60,40,70,80,90,100};
// find 70 is found are not ?


// class

public class linearsearch {
    public static void main(String[] args) {
        int[] num = {20,60,40,70,80,90,100};
int target = 70;
int ans = mylinearSearch2(num, target);
System.out.println(ans);

}


// search in an array 
// it return the index if item found 
// if item not found in the index it return null or -1


    static int mylinearSearch2(int[] arr, int target){
        // if an array is empty return null or -1 
        if(arr.length == 0){
            return -1;
        }
        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // Check an element of an every index of an array the target element is present
            int element = arr[index];
            if(element == target){
                return index;
            }  
            
        }
    
        //  this line execute if null of the return statement if target not found
    return -1;
    } 

    
    
    // for returning element 

    static int mylinearSearch1(int[] arr, int target){
        // if an array is empty return null or -1 
        if(arr.length == 0){
            return -1;
        }
        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // Check an element of an every index of an array the target element is present
            int element = arr[index];
            if(element == target){
                return element;
            }  
            
        }
    
        //  this line execute if null of the return statement if target not found
    return -1;
    } 
}


