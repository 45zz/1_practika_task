package com.company;

public class Main {

    public static void main(String[] args) {
	Ball ball1=new Ball();
	Book book1=new Book();
	Dog dog1=new Dog();
	Ball ball2=new Ball("red",10);
	Book book2=new Book("Tolstoy",400);
	Dog dog2=new Dog("Killer",7);
	System.out.println(ball1.toString());
	System.out.println(book1.toString());
	System.out.println(dog1.toString());
	System.out.println(ball2.toString());
	System.out.println(book2.toString());
	System.out.println(dog2.toString());
    }
}
