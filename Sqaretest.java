package Geometry;

public class Sqaretest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow",true,3.5);
        System.out.println(square);

    }
}
