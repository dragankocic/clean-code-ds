package entities;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator calculator;

    public ShapesPrinter(IAreaCalculator calculator) {
        this.calculator = calculator;
    }

    public String json(List<Shape> shapes) {
        return "{sum : %s}".formatted(calculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum, %s".formatted(calculator.sum(shapes));
    }
}
