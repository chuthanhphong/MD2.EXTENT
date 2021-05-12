package Geometry;

public class Square extends Rectangle {
    public Square(){};

    public Square(double size) {
        super(size,size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
         setWidth(size);
         setLeight(size);
    }
    public  void setWidth(double size){
        setSize(width);
    }
    public void setLeight(double size){
        setSize(leight);
    }

    public Square( String color, boolean filled,double size) {
        super(color,filled,size,size);

    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}

