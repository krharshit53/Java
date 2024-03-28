package org.example.functionalinterface.predicate;


import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (var) -> var < 10;

        System.out.println(predicate.test(15));
    }
}