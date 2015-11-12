package com.micles92;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Bolesław on 2015-11-11.
 */
public class Main {
    public static void main(String[] args) {

        List<Book> list = new ArrayList<Book>();
        HashSet<Book> set = new HashSet<Book>();


        list.add(new Book(1, "tytul1", "autor 1"));
        list.add(new Book(3, "tytul3", "autor 3"));
        list.add(new Book(2, "tytul2", "autor 2"));
        list.add(new Book(2, "tytul2", "autor 2"));


        set.add(new Book(6, "tytul6", "autor 6"));
        set.add(new Book(4, "tytul4", "autor 4"));
        set.add(new Book(5, "tytul5", "autor 5"));
        set.add(new Book(6, "tytul6", "autor 6"));
        set.add(new Book(4, "tytul4", "autor 4"));

        System.out.println("Hashset: "+ set);
        System.out.println();
        System.out.println();
        System.out.println("Elementy listy:");
        for(Book x : list) {
            System.out.println(x);
        }

        list.remove("Najs");


        if(list.contains(new Book(1, "tytul1", "autor 1"))) System.out.println("Zawiera taki element.");
        else {
            System.out.println("Nie zawiera");
        }

        Collections.sort(list);


        for(Book x : list) {
            System.out.println(x);
        }


    }
}
