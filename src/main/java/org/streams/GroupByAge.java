package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
    private String name;
    private int age;

    public Person (String name,int age){
        this.name = name;
        this.age =age;
    }
    public String getName(){

        return name;
    }
    public int getAge(){

        return age;
    }

    @Override
    public String toString(){

        return name + "(" + age +" years old)";
    }

}

public class GroupByAge {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Venkat",30),
                new Person("Dilip",25),
                new Person("Vijeth",26)
        );
        Map<Integer,List<Person>> groupedByAge = people.stream()
                                                      .collect(Collectors.groupingBy(Person::getAge));

        groupedByAge.forEach((age, persons) -> {
            System.out.println("Age"+ age + ":" + persons);
        });

    }
}