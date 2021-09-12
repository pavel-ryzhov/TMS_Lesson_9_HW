package task0;

import task0.figure.Circle;
import task0.figure.IFigure;
import task0.figure.Rectangle;
import task0.figure.Triangle;

/**
 * Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг. Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
 * Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.
 */
public class Main {
    public static void main(String[] args) {
        IFigure[] figures = {
                new Circle(632.23),
                new Rectangle(7834.23, 344),
                new Triangle(8734, 3498, 39.23),
                new Circle(43),
                new Circle(34.3222)
        };
        double sum = 0;
        for (IFigure figure: figures){
            sum += figure.getPerimeter();
        }
        System.out.println(sum);
    }
}
