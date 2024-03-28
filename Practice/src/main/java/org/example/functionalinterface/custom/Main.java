package org.example.functionalinterface.custom;

public class Main {

    public static void main(String[] args) {
        // anonymous class
        Person person = new Person() {
            @Override
            public void walk() {
                System.out.println("walk");
            }
        };

        person.walk();

        // lambda implementation
        Person person1 = () -> {
            System.out.println("walk");
        };

        person1.walk();
    }
}
