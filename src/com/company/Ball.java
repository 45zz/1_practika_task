package com.company;

public class Ball {
    private String color;
    private int size;
    public Ball (String color, int size){
        this.color=color;
        this.size=size;
    }
    public Ball (){
        color="yellow";
        size=15;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
