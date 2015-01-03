package com.hbt.Collection;

import com.hbt.BuilderLs5.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionUnion {

    public static Collection<Person> leftUnion(Collection<Person> rightCollection, Collection<Person> leftCollection) {


        return null;
    }

    public static void main(String[] args) {

        List<String> test1 = new ArrayList<String>();
        List<String> test2 = new ArrayList<String>();

        test1.add("a");
        test1.add("b");
        test1.add("c");

        test2.add("e");
        test2.add("f");
        test2.add("d");

        List<String> test3 = new ArrayList<String>();
        test3.addAll(test1);
        test3.addAll(test2);

        System.out.println(test3.toString());

    }


}
