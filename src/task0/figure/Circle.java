package task0.figure;

public class Circle implements IFigure{
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new ArithmeticException("Length can not be non-positive");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}
