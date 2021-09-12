package task0.figure;

public class Rectangle implements IFigure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0|| height <= 0) throw new ArithmeticException("Length can not be non-positive");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
