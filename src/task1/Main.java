package task1;

import task1.jobPosition.Accountant;
import task1.jobPosition.Director;
import task1.jobPosition.Worker;

/**
 * 1. Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом, который печатает название должности и имплементировать этот метод в созданные классы.
 */
public class Main {
    public static void main(String[] args) {
        new Worker().showPosition();
        new Director().showPosition();
        new Accountant().showPosition();
    }
}
