package micles93;

import java.util.HashSet;

/**
 * Created by Bolesław on 2015-11-12.
 */
public class Main2 {
    public static void main(String[] args) {
        HashSet<String> hset =  new HashSet<String>();
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Orange");
        hset.add("Nie");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");

        //Addition of null values
        hset.add(null);
        hset.add(null);

        System.out.println(hset);

        hset.remove("Apple");

        System.out.println(hset);


    }
}
