package org.example.functionalinterface.supplier;


import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }
}