package lesson.five;

public class Rectangle extends Square {

    private double width;

    public Rectangle(double width, double length) {
        super(length);
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (2 * (width + getLength()));
    }
    public double square() {
        return (width * getLength());
    }

    public double getWidth() {
        return width;
    }
}
