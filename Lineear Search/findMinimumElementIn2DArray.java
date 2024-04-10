// find minimum value in the 2D array



public class findMinimumElementIn2DArray {
    public static void main(String[] args) {
       
        int[][] arr = {
                { 23, 4, 5 },
                { 18, 12, 3, 9 },
                { 78, 99, 70, 80 },
                { 58, 69, 70, 10 },
        };
    
        System.out.println(minimum(arr));
    }

    static int minimum(int[][] arr) {
        // 2147483647 MAX_VALUE
        int min = Integer.MAX_VALUE; //  constant holding the maximum value an int can have, 231-1
        for (int[] ints : arr) {
            for (int element : ints) {
                if(element < min){
                    min = element;
                }
            }

        }
        return min;
    }
}
