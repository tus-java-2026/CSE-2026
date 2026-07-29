package com.tus.shipping;

public class ShippingCalculator {

    public double calculateShippingCost(char shippingType, double weight) {

        // Handle negative weight
        if (weight < 0) {
            return 0.0;
        }

        switch (Character.toUpperCase(shippingType)) {

            case 'S':
                return weight * 5.0;

            case 'E':
                return weight * 10.0;

            case 'O':
                return weight * 20.0;

            default:
                return 0.0;
        }
    }
}

	


