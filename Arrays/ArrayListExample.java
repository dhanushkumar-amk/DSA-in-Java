package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(1);

        // adding the element in an array List
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // to check the value present or not
        System.out.println(list.contains(20));
        System.out.println(list);

        // update or modify the value or replace
        list.set(1, 70);

        /*
         * output:
         * [10, 20, 30, 40]
         * [10, 70, 30, 40]
         */

        // remove an element in arrayList
        list.remove(2);

        // get item of an index
        System.out.println(list.get(1));
        // output 70

        System.out.println(list);

    }
}
