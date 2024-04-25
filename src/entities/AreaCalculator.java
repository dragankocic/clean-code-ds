package entities;

import java.util.List;

public class AreaCalculator implements IAreaCalculator{

    public double sum(List<Shape> shapes) {
        int sum = 0;

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shape.area();
        }

        return sum;
    }


}
