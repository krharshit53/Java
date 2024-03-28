package org.example.functionalinterface.custom;

import org.example.functionalinterface.custom.Person;

public class Student implements Person {

    @Override
    public void walk() {
        System.out.println("Student walking");
    }

    @Override
    public void talk() {
        Person.super.talk();
    }
}
