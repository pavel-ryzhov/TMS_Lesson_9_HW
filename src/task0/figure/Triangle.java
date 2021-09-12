package task0.figure;

public class Triangle implements IFigure{

    private double[] sides;

    public Triangle(double a, double b, double c) throws ArithmeticException{
        if (a <= 0 || b <= 0 || c <= 0) throw new ArithmeticException("Length can not be non-positive");
        sides = new double[]{a, b, c};
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p * sides[2]));
    }

    @Override
    public double getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }
}
