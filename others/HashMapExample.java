import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // O(1) time complexity

        // adding the value
        hm.put("dhanush", 90);
        hm.put("aswin", 98);

        System.out.println(hm);

        hm.put("sanjay", 100);

        System.out.println(hm);

        // update value
        hm.put("dhanush", 93);

        System.out.println(hm);

        // removing the element

        hm.remove("aswin");
        System.out.println(hm);

        // check the value available in the hashmap
        if (hm.containsKey("dhanush"))
            System.out.println("present");
        else
            System.out.println("not present");

    }
}
