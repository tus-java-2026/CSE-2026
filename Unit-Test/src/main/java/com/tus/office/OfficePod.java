package com.tus.office;

public class OfficePod {
    private final String name;
    private final boolean hasVideoConferencing;
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

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

	public boolean isHasVideoConferencing() {
		return hasVideoConferencing;
	}

}

