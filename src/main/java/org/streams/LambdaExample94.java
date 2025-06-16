package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class LambdaExample94 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack");
        List<Person> collect = names.stream().map(name -> new Person(name, 25)).collect(Collectors.toList());
        collect.forEach(person -> System.out.println(person.getName() + ":" + person.getAge()));
    }
}
