package com.tus.garage;

import java.util.*;

public class Garage {
	private ArrayList<Car> cars;

	public Garage() {
		cars = new ArrayList<>();
	}

	public String addCar(Car car) {
		//To Do
		
		String returnString = "CAR ADDED";
		
		String model = car.getModelName();
		
		String registration = car.getRegistrationNumber();
		
		if (model.isEmpty()) {    
		returnString = "MODEL OR REGISTRATION EMPTY";
		}
			
			if (registration.isEmpty()) {
				returnString = "MODEL OR REGISTRATION EMPTY";
				
			}
			
			if (returnString.equals("CAR ADDED")) {
				cars.add(car);
		}
		return returnString ;
	}
	
	

	public String rateCar(String modelName, int rating) {
		//To Do
		
		
		return null;
	}

	public ArrayList<String> getTopRatedCarsByReg(int n) {
	    //To Do
	    return null;
	}

	public int getTotalCars() {
		//To Do
		return 0;
	}

	public String chargeElectricCar(String regNumber) {
		
		
		return null;
	}

}