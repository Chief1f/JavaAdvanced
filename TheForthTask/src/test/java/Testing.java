import org.example.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Testing {

    @org.junit.Test
    public void checkAddition() {
        assertEquals(2, Addition.calc(1, 1), 0.00005);

    }

    @org.junit.Test
    public void checkSubtraction() {
        assertEquals(1, Subtraction.calc(2, 1), 0.00005);


    }

    @org.junit.Test
    public void checkMultiplication() {
        assertEquals(1, Multiplication.calc(1, 1), 0.00005);

    }

    @org.junit.Test
    public void checkDivisionInGeneral() throws DivisionByZero {

        assertEquals(2, Division.calc(4, 2), 0.00005);


    }

    @org.junit.Test
    public void checkDivisionByZero() {
        try {
            Division.calc(1, 0);
        } catch (DivisionByZero e){
            assertEquals("Деление на ноль", e.getMessage());
        }


    }

}
