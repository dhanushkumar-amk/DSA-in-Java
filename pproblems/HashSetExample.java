package pproblems;

import java.util.HashSet;

/**
 * HashSet.Example
 */
public class HashSetExample {
    // it never add the value duplicate again
    public static void main(String[] args) {

        // creating a HashSet
        HashSet<Integer> hs = new HashSet<>();

        // adding the value
        hs.add(4);
        hs.add(5);
        hs.add(1);
        hs.add(2);

        // print
        System.out.println(hs);

        // check the present of element in HashSet
        if (hs.contains(8))
            System.out.println("present");
        else
            System.out.println("Not Present");

        // delete an element in HashSet
        hs.remove(2);

        System.out.println(hs);
    }

}