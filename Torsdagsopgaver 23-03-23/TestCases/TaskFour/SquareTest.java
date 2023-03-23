package TaskFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {


    @org.junit.jupiter.api.Test
    void calculationTestGetArea() {
        Square square = new Square(2);

        assertEquals(4, square.getArea());
    }

}