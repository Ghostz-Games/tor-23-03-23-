package TaskFour;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {

    @org.junit.jupiter.api.Test
    void calculationTestGetTotalArea() {
        ShapeBuilder builder = new ShapeBuilder();
        Square square1 = new Square(4);
        Square square2 = new Square(4);
        Square square3 = new Square(4);
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(2);
        builder.addShape(square1);
        builder.addShape(square2);
        builder.addShape(square3); //48
        builder.addShape(circle1);
        builder.addShape(circle2);
        builder.addShape(circle3); //37, 68


        assertEquals(85.68, builder.getTotalArea());
    }

}