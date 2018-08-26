package com.shengsiyuan.jvm.classloader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyTT {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 1);
        Student s2 = new Student("zhangsan2", 2);
        Student s3 = new Student("zhangsan3", 3);
        Student s4 = new Student("zhangsan4", 4);

        List<Student> list = new ArrayList<>();
        /*list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);*/

        Map<String, Student> map = list.stream().collect(Collectors.toMap(Student::getName, stu -> stu));

        map.forEach((key, value) -> System.out.println(key + " : [" + value.age + "]"));

    }
}



class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
