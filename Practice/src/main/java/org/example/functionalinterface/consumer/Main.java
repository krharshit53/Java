package org.example.functionalinterface.consumer;


import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<String> consumer = (var) -> {
            System.out.println(var);
        };

        consumer.accept("hello world");
    }
}
