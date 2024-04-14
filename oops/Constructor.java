package oops;

// constructors are used to set default values

public class Constructor {
    int rollNo;
    int marks;

    Constructor() {
        // default Constructor
        System.out.println("Hello world");
        rollNo = 10;
        marks = 100;
    }
}

class Construct {
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println(obj.rollNo);
        System.out.println(obj.marks);

    }
}