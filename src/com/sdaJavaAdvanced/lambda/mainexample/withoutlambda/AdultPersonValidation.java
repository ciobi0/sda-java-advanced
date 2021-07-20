package com.sdaJavaAdvanced.lambda.mainexample.withoutlambda;

import java.util.function.Predicate;

public class AdultPersonValidation implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.getAge()>=18;
    }
}
