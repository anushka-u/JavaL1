package Java17Features.SealedClasses;

public abstract sealed class Shape permits Java17Features.SealedClasses.Circle, Java17Features.SealedClasses.Rectangle, Java17Features.SealedClasses.Square {
    public abstract double area();
}