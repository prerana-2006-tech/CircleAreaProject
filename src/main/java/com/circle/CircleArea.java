
package com.circle;

public class CircleArea {

    public double calculateArea(double radius) {

        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        CircleArea circle = new CircleArea();

        double radius = 5;

        double area = circle.calculateArea(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}
