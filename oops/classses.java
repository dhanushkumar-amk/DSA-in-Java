package oops;

// class is a template of an object

public class classses {
    String name;
    int age;

    public void display() {
        System.out.println(name + "  " + age);
    }

    // public static void main(String[] args) {

    // creating a object
    // new is keyword allocation of space
    // constructor classses();

    // classses objectName = new classses();
    // objectName.name = "Dhanushkumar";
    // objectName.age = 19;
    // objectName.display();

    // }
    public void setName(String name1) {
        name = name1;
    }

}

/**
 * Main
 * 
 * 
 */
class Main {

    public static void main(String[] args) {

        // creating a object
        // new is keyword allocation of space
        // constructor classses();

        classses objectName = new classses();
        objectName.name = "Dhanushkumar";
        objectName.age = 19;
        objectName.display();

        classses user = new classses();
        user.setName("Hello");
        user.age = 29;
        user.display();

    }

}
