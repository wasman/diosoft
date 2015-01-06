package com.hbt.Collection;

public interface PersonValidation {

    public <T> boolean validate(T person);

    public <T> boolean validatePersons(T[] rightArray, T[] leftArray);



}
