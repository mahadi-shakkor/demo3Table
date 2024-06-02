package com.oop.mahadi.demo3table;

public class Stu {
    String name;
    int id;
    int marks;

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Stu(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
}
