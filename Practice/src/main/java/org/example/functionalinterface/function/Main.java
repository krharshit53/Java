package org.example.functionalinterface.function;


import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Boolean, String> function = (var) -> {
            if (var) {
                return "true";
            }
            return "false";
        };

        function.apply(true);
    }
}
