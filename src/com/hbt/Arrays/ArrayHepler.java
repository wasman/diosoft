package com.hbt.Arrays;

import com.hbt.Builder.Person;

import java.util.Arrays;

public class ArrayHepler {

    public static Person[] merge(Person[] rightArray, Person[] leftArray) {
        Person[] array = ArraysUnion.union(rightArray, leftArray);
        Arrays.sort(array);

        Person[] newArray = new Person[0];
        int q = 0;
        for(Person person: array) {
            int result = Arrays.binarySearch(newArray, person);
            if(result < 0) {
                newArray = Arrays.copyOf(newArray, newArray.length +1);
                newArray[q] = person;
                q++;
            }
        }

        return newArray;
    }



}
