package com.hbt.Collection;


import com.hbt.Builder.Person;

import java.util.TreeSet;

public class CollectionServiceDelegate{

    private final CollectionUnion collectionUnion;
    private final PersonValidation validator;

    public CollectionServiceDelegate(CollectionUnion collectionUnion, PersonValidation validator) {
        this.collectionUnion = collectionUnion;
        this.validator = validator;
    }

    public <T> TreeSet validatePersons(T[] rightArray, T[] leftArray) {
        for(T person : rightArray) {
            if (!validator.validate(person)) {
                return null;
            }
        }

        for(T person : leftArray) {
            if (!validator.validate(person)) {
                return null;
            }
        }

        TreeSet<T> results = collectionUnion.merge(rightArray, leftArray);
        return results;
    }

//    public boolean PersonValidator(Person person) {
//        if(!(person.getAge() > 0) && !(person.getAge() <200)) {
//            return false;
//        } else if (!(person.getName() == null) && !(person.getName().isEmpty())) {
//            return false;
//        }
//
//        return true;
//    }

}
