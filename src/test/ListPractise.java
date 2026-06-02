package test;


import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    int age;
    String email;

    public Student(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "id:" + id + " name:" + name + " age:" + age + " email:" + email;
    }
}

public class ListPractise {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1, "peter", 21, "peter@gmail.com");
        Student s2 = new Student(2, "david", 32, "david@gmail.com");
        Student s3 = new Student(3, "ellis", 23, "ellis@gmail.com");
        Student s4 = new Student(4, "boyd", 26, "boyd@gmail.com");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        List<Student> list1 = list.stream().filter(l -> l.age > 25).toList();
        System.err.println(list);
        System.out.println(list1);
    }
}
