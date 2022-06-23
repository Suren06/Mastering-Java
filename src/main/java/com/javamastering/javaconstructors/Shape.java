package com.javamastering.javaconstructors;

import java.awt.*;

public class Shape {

    public static void main(String[] args) {

        // Instantiating Circle Objects
        Circle circle = new Circle(new Point(1,2), 6);

        System.out.println(circle.center);
        System.out.println(circle.radius);
    }

}
