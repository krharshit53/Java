package org.example.reflections;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Eagle.class;
        System.out.println(clazz.getPackage());
        List<Method> methods = List.of(clazz.getMethods());
        methods.forEach(method -> {
                System.out.println(method.getName());
                method.getAnnotatedReturnType();
                System.out.println(method.getParameterCount());
            }
        );
        List<Field> fields = List.of(clazz.getFields());
        fields.forEach(field -> {
            System.out.println(field.getName());
        });
    }
}
