package Java17Features.SealedClasses;

public final class Square extends Java17Features.SealedClasses.Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}