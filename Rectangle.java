package Geometry;

public class Rectangle extends Shape {
    double width = 1.0;
    double leight = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double leight) {
        this.width = width;
        this.leight = leight;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.leight = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLeight() {
        return leight;
    }

    public void setLeight(double leight) {
        this.leight = leight;
    }
    public  double getarea(){
        return this.width*this.leight;
    }
    public double getPerimeter(){
        return (this.width+this.leight*2);
    }

    @Override
    public String toString() {
        return "A rectangle with =" + getWidth() + "and leight  " +getLeight() +"which a subclass" + super.toString();
    }
}
