package Shape;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

//    @Override
//    public void setWidth(double width) {
//        setWidth(width);
//    }

//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "A Square width side = " +
                getSide() +
                ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        double side = getSide() * percent;
        setSide(side);
    }
}
