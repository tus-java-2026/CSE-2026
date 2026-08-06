package com.tus.garage;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Car> cars;

    public Garage() {
        cars = new ArrayList<>();
    }

    public int getTotalCars() {
        return cars.size();
    }

    public String addCar(Car car) {

        if (car.getModelName().isEmpty() || car.getRegistrationNumber().isEmpty()) {
            return "MODEL OR REGISTRATION EMPTY";
        }

        if (!(car.getType().equals("petrol")
                || car.getType().equals("diesel")
                || car.getType().equals("electric"))) {

            return "INVALID CAR TYPE";
        }

        for (Car c : cars) {
            if (c.getRegistrationNumber().equals(car.getRegistrationNumber())) {
                return "CAR ALREADY IN GARAGE";
            }
        }

        cars.add(car);
        return "CAR ADDED";
    }

    public String chargeElectricCar(String registrationNumber) {

        for (Car c : cars) {

            if (c.getRegistrationNumber().equals(registrationNumber)) {

                if (!c.getType().equals("electric")) {
                    return "NOT AN ELECTRIC CAR";
                }

                for (Car car : cars) {
                    if (car.isCharging()) {
                        return "SORRY CHARGING POINT IN USE";
                    }
                }

                c.setCharging(true);
                return "CAR CHARGING";
            }
        }

        return "REGISTRATION NOT RECOGNISED";
    }

    public String rateCar(String modelName, int rating) {

        int count = 0;

        for (Car c : cars) {

            if (c.getModelName().equals(modelName)) {
                c.setRating(rating);
                count++;
            }
        }

        return "RATING UPDATED FOR " + count + " CARS";
    }

    public ArrayList<String> getTopRatedCarsByReg(int n) {

        ArrayList<String> result = new ArrayList<>();

        for (int rating = 5; rating >= 1; rating--) {

            for (Car c : cars) {

                if (c.getRating() == rating) {

                    result.add(c.getRegistrationNumber());

                    if (result.size() == n) {
                        return result;
                    }
                }
            }
        }

        return result;
    }

}