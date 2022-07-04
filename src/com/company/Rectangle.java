package com.company;

public class Rectangle {
    protected double width;
    protected double length;
    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }
    public void getPerimeter(){
        System.out.println("Perimeter: " + (2*(this.width + this.length)));
    }
    public void getSquare(){
        System.out.println("Square: " + (this.width * this.length));
    }
}
