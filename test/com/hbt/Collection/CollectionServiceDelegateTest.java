package com.hbt.Collection;

import com.hbt.Builder.Person;
import org.junit.Test;

import java.util.TreeSet;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CollectionServiceDelegateTest {

    @Test
    public void testPersonValidator() throws Exception {

        Person person1 = new Person.Builder().name("Denis").age(10).build();
        Person person2 = new Person.Builder().name("Denis").age(23).build();
        Person person3 = new Person.Builder().name("Vlad").age(18).build();
//        Person person4 = new Person.Builder().name("Sergey").age(45).build();
//        Person person5 = new Person.Builder().name("Volodya").age(22).build();

        Person[] rightArray = {person1};
        Person[] leftArray  = {person2, person3, person1};

        CollectionUnion test = new CollectionUnion();
        TreeSet<Person> expectedMergeResults = test.merge(rightArray, leftArray);

        PersonValidation personValidation = mock(PersonValidation.class);
        CollectionUnion collectionUnion = mock(CollectionUnion.class);

        when(personValidation.validate(person1)).thenReturn(true);
        when(personValidation.validate(person2)).thenReturn(true);
        when(personValidation.validate(person3)).thenReturn(true);

        TreeSet<Person> mergeResults = new TreeSet<Person>();
        mergeResults.add(person1);
        mergeResults.add(person2);
        mergeResults.add(person3);

       when(collectionUnion.merge(rightArray, leftArray)).thenReturn(mergeResults);

        CollectionServiceDelegate testdelegate = new CollectionServiceDelegate(collectionUnion, personValidation);
        TreeSet<Person> result = testdelegate.validatePersons(rightArray, leftArray);
        assertEquals(expectedMergeResults, result);

    }


}