package Java17Features.SealedClasses;
import Java17Features.SealedClasses.Shape;
import Java17Features.SealedClasses.Circle;
import Java17Features.SealedClasses.Rectangle;
import Java17Features.SealedClasses.Square;
public class MainClass {
    public static void main(String[] args) {
         Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Square area: " + square.area());
    }
}