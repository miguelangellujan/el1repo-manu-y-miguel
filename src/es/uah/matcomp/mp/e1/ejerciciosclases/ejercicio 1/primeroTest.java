package es.uah.matcomp.mp.e1.ejerciciosclases;

import junit.framework.TestCase;

public class primeroTest extends TestCase {
        public static void main(String[] args) {
            primero c1 = new primero(1.1);
            System.out.println(c1);
            primero c2 = new primero();
            System.out.println(c2);
            c1.setRadius(2.2);
            System.out.println(c1);
            System.out.println("radius is: " + c1.getRadius());
            System.out.printf("area is: %.2f%n", c1.getArea());
            System.out.printf("circumference is: %.2f%n", c1.getCircumference());
}}