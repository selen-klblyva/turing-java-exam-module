package org.example;

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ArrayApp {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Selen", 20);
        students[1] = new Student("Sevda", 19);
        students[2] = new Student("Camila", 22);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student name " + (i + 1) + ": " + students[i].name + " Student age: " + students[i].age);
        }
    }
}