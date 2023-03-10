package Shape;

public class Rectangle extends Shape {
    public double length = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width * length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " +
                getWidth() +
                " and lenght = " +
                getLength() +
                ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        double length = getLength() * percent;
        double width = getWidth() * percent;
        setLength(length);
        setWidth(width);
    }
}
