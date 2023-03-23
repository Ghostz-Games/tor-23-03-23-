package TaskFour;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void calculationTestGetArea() {
        Circle circle = new Circle(2);

        assertEquals(12.56, circle.getArea());
    }
}