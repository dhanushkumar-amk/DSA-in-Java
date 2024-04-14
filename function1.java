

// function two parts 

// ! 1 => function Definition
// ! 2 => function Calling 

public class function1 {
    // function always inside the class
    public static void main(String[] args) {

        // function calling
        add();
        sub(20, 10);
        System.out.println(add3(20, 30));
    }


    // function definition

    // void function
    // non parameterized function
    public static void add() {
        // add function name()
        int a  = 10;
        int b =20;
        int c = a + b;
        System.out.println(c);

    }

// void function with parameters
// parametrized function
    public static void sub(int d ,int e) {
    
        int f= d - e;
        System.out.println(f);

}

//non void function
// parametrized function
 public static int add3(int x, int y){
    int z = x + y;
    return z;
 }

}

// necessary for function

// void =>  no return value 

// => return type  int[]