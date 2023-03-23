package TaskFour;

import java.util.ArrayList;

public class ShapeBuilder {

    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s){
        shapes.add(s);
    }

    public double getTotalArea(){
        double sum = 0;
        for(Shape s: shapes){
            sum += s.getArea();
        }
        return sum;
    }


}
