package com.tus.garage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class GarageTest {

    private Garage garage;

    @BeforeEach                // @BeforeEach to set up the test
    public void setUp() {
        garage = new Garage();
    }
    //Test 1-1
    @Test                          // before doing every testing, it is define that is the test case 
    void testZeroCars() {
    	
    		// To Do

    		assertEquals(0, garage.getTotalCars());   // will get the no of cars using get
    	}
    
    //Test 1-2 
   @Test
    
  void testAddCarOK() {
	   Car car = new Car("123", "Model S", "electric");
		assertEquals("CAR ADDED",garage.addCar(car));
		assertEquals(1, garage.getTotalCars());
	}
   
//        Car car = new Car("123", "Model S", "electric"); //another mehod of testing by mary solution
//        String result = garage.addCar(car);
//        assertEquals("CAR ADDED", result);
//        assertEquals(1, garage.getTotalCars());
//    }
   
 


    // Test 1-3
    @Test
    void testAddCarEmptyModel() {
       // To Do
    	
    	Car car = new Car ("145", " "," electric");
    	assertEquals("MODEL OR REGISTRATION EMPTY",garage.addCar(car));
    	assertEquals(0,garage.getTotalCars());
    }
    // Test 1-4 
    @Test
    void testAddCarEmptyReg() {
        //To Do
    }

     // Test 1-5
    @Test
    void testAddCarInvalidType() {
       //To Do
    }
   // Test 1-6
    @Test
    void testAddDuplicateCar() {
        //To Do 
    }

    //Test 2-1
    @Test
    void testChargeElectricCarOK() {
        //To Do
    }
    // Test 2-2
    @Test
    void testChargeElectricCarWhileAnotherIsCharging() {
        //To Do 
    }
    //Test 2-3
    @Test
    void testChargePetrolCar() {
        //To Do
    }
     // Test 2-4
    @Test
    void testChargeUnknownCar() {
        //To Do 
    }
    // Test 3-1
    @Test
    void testRateCarValid() {
        //To Do
    }
    //Test 4-1
    @Test
     void testGetTopRatedCarsRatingFive() {
        //To Do 
    }
    
    //Test 4-2
    @Test
    void testGetTopRatedCarsRatingOne() {
       //To Do
   }

}