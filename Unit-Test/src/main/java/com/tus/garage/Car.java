package com.tus.garage;

public class Car {
	
	private String registrationNumber;
    private String modelName;
    private String type;
    private int rating=0;
    private boolean isCharging = false; 

    public Car(String registrationNumber, String modelName, String type) {
        this.registrationNumber = registrationNumber;
        this.modelName = modelName;
        this.type = type;
    }


	public String getRegistrationNumber() { 
    	return registrationNumber; 
    }
    
    public String getModelName() { 
    	return modelName; 
    	    	}
    
    public String getType() {
    	return type;
    	}
    
    public int getRating() { 
    	return rating; 	
    }
    
    public boolean isCharging() {
    	return isCharging; 
    	}
    
    public void setRating(int rating) {
    	this.rating = rating; 
    	}
    
    public void setCharging(boolean charging) { 
    	this.isCharging = charging; 
    	}
    public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}