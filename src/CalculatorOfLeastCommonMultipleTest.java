import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorOfLeastCommonMultipleTest {

    @org.junit.jupiter.api.Test
    void calculateLCM() {
        CalculatorOfLeastCommonMultiple calculator = new CalculatorOfLeastCommonMultiple(10, 15);
        Assert.assertEquals(30, calculator.calculateLCM(calculator));
    }

    @org.junit.jupiter.api.Test
    void whichNumberIsBigger() {
        CalculatorOfLeastCommonMultiple calculator = new CalculatorOfLeastCommonMultiple(10, 15);
        Assert.assertEquals(15, calculator.whichNumberIsBigger(calculator));
    }
}