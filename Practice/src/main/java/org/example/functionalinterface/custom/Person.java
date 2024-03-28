package org.example.functionalinterface.custom;

@FunctionalInterface
public interface Person {

    void walk();

    default void talk() {
        System.out.println("Person talking");
    }

    static void sayHello() {
        System.out.println("Hello sample");
    }

    String toString();
}
