//package org.streams;
//
//import java.util.*;
//class Employee {
//    int id;
//    double salary;
//
//    public Employee(int id, double salary) {
//        this.id = id;
//        this.salary = salary;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{id=" + id + ", salary=" + salary + '}';
//    }
//}
//
//public class SecondHighestSalary {
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee(1, 5000),
//                new Employee(2, 7000),
//                new Employee(3, 8000),
//                new Employee(4, 7500),
//                new Employee(5, 9000)
//        );
//
//        employees.stream()
//                .map(Employee::getSalary)
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .ifPresentOrElse(
//                        salary -> System.out.println("Second Highest Salary: " + salary),
//                        () -> System.out.println("No second highest salary found")
//                );
//    }
//}
//
