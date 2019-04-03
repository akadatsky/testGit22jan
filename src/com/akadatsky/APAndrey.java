package com.akadatsky;

public class APAndrey {
    private int age;
    private int size;
    private String name;

    public APAndrey(int age, int size, String name) {
        this.age = age;
        this.size = size;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "APAndrey{" +
                "age=" + age +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
