package com.tus.garage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GarageTest {

    private Garage garage;
    private Car car1;
    private Car car2;
    private Car car3;

    @BeforeEach
    public void setUp() {

        garage = new Garage();

        car1 = new Car("11D12345", "Tesla Model 3", "electric");
        car2 = new Car("12D23456", "BMW X5", "diesel");
        car3 = new Car("13D34567", "Nissan Leaf", "electric");
    }

    // User Story 1

    @Test
    public void testZeroCars() {
        assertEquals(0, garage.getTotalCars());
    }

    @Test
    public void testAddCarOK() {
        assertEquals("CAR ADDED", garage.addCar(car1));
        assertEquals(1, garage.getTotalCars());
    }

    @Test
    public void testAddCarEmptyModel() {

        Car car = new Car("11D12345", "", "electric");

        assertEquals("MODEL OR REGISTRATION EMPTY", garage.addCar(car));
        assertEquals(0, garage.getTotalCars());
    }

    @Test
    public void testAddCarEmptyReg() {

        Car car = new Car("", "Tesla", "electric");

        assertEquals("MODEL OR REGISTRATION EMPTY", garage.addCar(car));
        assertEquals(0, garage.getTotalCars());
    }

    @Test
    public void testAddCarInvalidType() {

        Car car = new Car("11D12345", "Tesla", "hydrogen");

        assertEquals("INVALID CAR TYPE", garage.addCar(car));
        assertEquals(0, garage.getTotalCars());
    }

    @Test
    public void testAddDuplicateCar() {

        garage.addCar(car1);

        Car duplicate = new Car("11D12345", "Tesla Model S", "electric");

        assertEquals("CAR ALREADY IN GARAGE", garage.addCar(duplicate));
        assertEquals(1, garage.getTotalCars());
    }

    // User Story 2

    @Test
    public void testChargeElectricCarOK() {

        garage.addCar(car1);

        assertEquals("CAR CHARGING", garage.chargeElectricCar("11D12345"));
        assertTrue(car1.isCharging());
    }

    @Test
    public void testChargeElectricCarWhileAnotherIsCharging() {

        garage.addCar(car1);
        garage.addCar(car3);

        garage.chargeElectricCar("11D12345");

        assertEquals("SORRY CHARGING POINT IN USE",
                garage.chargeElectricCar("13D34567"));

        assertFalse(car3.isCharging());
    }

    @Test
    public void testChargePetrolCar() {

        Car petrolCar = new Car("99D11111", "Toyota", "petrol");

        garage.addCar(petrolCar);

        assertEquals("NOT AN ELECTRIC CAR",
                garage.chargeElectricCar("99D11111"));

        assertFalse(petrolCar.isCharging());
    }

    @Test
    public void testChargeUnknownCar() {

        garage.addCar(car1);

        assertEquals("REGISTRATION NOT RECOGNISED",
                garage.chargeElectricCar("UNKNOWN"));
    }

    // User Story 3

    @Test
    public void testRateCarValid() {

        garage.addCar(car1);
        garage.addCar(car2);

        assertEquals("RATING UPDATED FOR 1 CARS",
                garage.rateCar("Tesla Model 3", 4));

        assertEquals(4, car1.getRating());
        assertEquals(0, car2.getRating());
    }

    // User Story 4

    @Test
    public void testGetTopRatedCarsRatingFive() {

        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);

        car1.setRating(5);
        car2.setRating(4);
        car3.setRating(5);

        ArrayList<String> result = garage.getTopRatedCarsByReg(2);

        assertEquals(2, result.size());
        assertTrue(result.contains("11D12345"));
        assertTrue(result.contains("13D34567"));
    }

    @Test
    public void testGetTopRatedCarsRatingOne() {

        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);

        car2.setRating(1);

        ArrayList<String> result = garage.getTopRatedCarsByReg(1);

        assertEquals(1, result.size());
        assertEquals("12D23456", result.get(0));
    }

}