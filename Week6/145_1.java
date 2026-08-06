package com.tus.office;

public class OfficePod {

    private String name;
    private boolean hasVideoConferencing;
    private boolean booked;
    private String bookedBy;

    public OfficePod(String name, boolean hasVideoConferencing) {
        this.name = name;
        this.hasVideoConferencing = hasVideoConferencing;
        this.booked = false;
        this.bookedBy = "";
    }

    public String getName() {
        return name;
    }

    public boolean hasVideoConferencing() {
        return hasVideoConferencing;
    }

    public boolean isBooked() {
        return booked;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

}