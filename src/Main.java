import Shape.Circle;
import Shape.Shape;
import Shape.Rectangle;
import Shape.Square;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(20, 30);
        shapes[2] = new Square(25);

        for (Shape shape : shapes) {
            System.out.println("--------------Shape Before ==> ");
            System.out.println(shape);
            double random = (int) (Math.random() * 100);
            System.out.printf("Random value is: %.0f\n", random);
            if (shape instanceof Circle) {
                ((Circle) shape).resize(random);
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(random);
            } else ((Square) shape).resize(random);
            System.out.println("--------------Shape After ==> ");
            System.out.println(shape);
        }
    }
}
