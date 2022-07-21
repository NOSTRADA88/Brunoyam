package lesson.five;

public class Square {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double perimeter() {
        return 4 * length;
    }

    public double square() {
       return (length * length);
    }

    public double getLength() {
        return length;
    }
}
