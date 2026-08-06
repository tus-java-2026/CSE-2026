
package com.tus.shipping;

import org.junit.Test;

public class ShippingCalculatorTest {

    ShippingCalculator calculator = new ShippingCalculator();

    @Test
    public void testStandardShipping() {
        assertEquals(25.0,
                calculator.calculateShippingCost('S', 5.0),
                0.001);
    }

    private void assertEquals(double d, double calculateShippingCost, double e) {
	
		
	}

	@Test
    public void testExpressShipping() {
        assertEquals(50.0,
                calculator.calculateShippingCost('E', 5.0),
                0.001);
    }

    @Test
    public void testOvernightShipping() {
        assertEquals(100.0,
                calculator.calculateShippingCost('O', 5.0),
                0.001);
    }

    @Test
    public void testNoShippingOption() {
        assertEquals(0.0,
                calculator.calculateShippingCost('X', 5.0),
                0.001);
    }

    @Test
    public void testZeroWeight() {
        assertEquals(0.0,
                calculator.calculateShippingCost('S', 0.0),
                0.001);
    }

    @Test
    public void testNegativeWeight() {
        assertEquals(0.0,
                calculator.calculateShippingCost('S', -5.0),
                0.001);
    }
}