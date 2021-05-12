package Geometry;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getarea(){
       return radius*radius*Math.PI;
    }
    public double getPrimere(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Cicrle with radius" + getRadius() + " this area is " + getarea() + super.toString();
}}
