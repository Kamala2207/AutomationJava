package core;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        Assert.assertEquals(10, c.add(5, 5));
    }

    @Test
    public void testSub() {
        Calculator c = new Calculator();
        Assert.assertEquals(0, c.sub(5, 5));

    }
}
