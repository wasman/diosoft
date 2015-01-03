package com.hbt.Collection;

import com.hbt.Builder.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionUnion {

    public Collection<Person> leftUnion(Collection<Person> rightCollection, Collection<Person> leftCollection) {


        return null;
    }

    public static List<String> union(List<String> rightList, List<String> leftList) {

        List<String> unionList = new ArrayList<String>();
        unionList.addAll(rightList);
        unionList.addAll(leftList);

        return unionList;
    }


}
