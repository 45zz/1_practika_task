package com.company;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.age=age;
        this.name=name;
    }
    public Dog(){
        age=0;
        name="Pappy";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
