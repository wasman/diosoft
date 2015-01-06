package com.hbt.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MainCollection {

    public static void main(String[] args) {

        Integer[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        Integer[] leftArray = {1, 5, 4, 23, 65, 32, 78};

        Arrays.sort(leftArray);
        Arrays.sort(rightArray);

        System.out.println("leftArray: " + Arrays.toString(leftArray));
        System.out.println("rightArray: " + Arrays.toString(rightArray));

//        List<Integer> unionList = CollectionUnion.union(rightArray, leftArray);
//        System.out.println("Union: " + unionList.toString());
//
//        TreeSet<Integer> mergeTest = CollectionUnion.merge(rightArray, leftArray); // without duplicates
//        System.out.println("Merge: " + mergeTest.toString());
//
//        TreeSet<Integer> innerTest = CollectionUnion.inner(rightArray, leftArray);
//        System.out.println("Common: " + innerTest.toString());
//
//        TreeSet<Integer> outerTest = CollectionUnion.outer(rightArray, leftArray);
//        System.out.println("Difference: " + outerTest.toString());
//
//        ArrayList<Integer> leftUnionTest = CollectionUnion.leftUnion(rightArray, leftArray);
//        System.out.println("left union: " + leftUnionTest.toString());
//

    }


}
