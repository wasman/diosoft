package com.hbt.Collection;

import java.util.ArrayList;
import java.util.List;

public class MainCollection {

    public void main(String[] args) {

        List<String> test1 = new ArrayList<String>();
        List<String> test2 = new ArrayList<String>();

        test1.add("a");
        test1.add("b");
        test1.add("c");

        test2.add("e");
        test2.add("f");
        test2.add("d");

        List<String> unionList = CollectionUnion.union(test1, test2);

        System.out.println(unionList.toString());

    }


}
