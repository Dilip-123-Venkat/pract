package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(null, student.name);
    }

    public int hashcode(){
        return Objects.hash(id,name);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    @Override
    public int compareTo(Student s){
        if (id == s.id) {
            return 0;
        }
        else if (id > s.id) {
            return 1;
        }
        else {
            return -1;
        }
    }
    @Override
    public String toString(){
        return "Student {" + "id=" + id + ",name= " + name + '}';
    }



    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(101,"venkat");
        Student s2 = new Student(102,"dilip");
        Student s3 = new Student(103,"talari");

        students.add(s3);
        students.add(s1);
        students.add(s2);
        Collections.sort(students, new NameComparator());
        System.out.println(students);
    }






}
