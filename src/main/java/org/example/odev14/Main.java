package org.example.odev14;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        myClass.setValue("apple");
        Collection<String> stringCollection = List.of("apple", "banana", "orange");
        Optional<String> foundElement = myClass.findElement(stringCollection, myClass.getValue());

        foundElement.ifPresentOrElse(System.out::println, () -> System.out.println("-1"));
    }
}
