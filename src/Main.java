import entities.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var calculator = new AreaCalculator();
        var printer = new ShapesPrinter(calculator);

        var calculator2 = new AreaCalculator2();
        var printer2 = new ShapesPrinter(calculator2);

        var circle = new Circle(10);
        var square = new Square(10);

        var shapes = List.of(circle, square);

        //var sum = calculator.sum(shapes);

        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));

        System.out.println(printer2.json(shapes));
        System.out.println(printer2.csv(shapes));
    }
}