

//import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTests {

    Calculator calc;

    @Test
    public void addTest() {
        //Given
        calc = new Calculator();
        //When
        int sum = calc.add(3, 2);
        //Then
        assertEquals(5, sum);
    }
}