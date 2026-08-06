package com.tus.office;
import java.util.ArrayList;

import com.tus.catpound.Cat;

import java.util.ArrayList;

public class SmartOffice {

	private ArrayList<OfficePod> pods;

	public SmartOffice() {
		pods = new ArrayList<>();
	}

	// User Story 1
	public int getTotalPods() {
		return pods.size();
	}

	// User Story 2
	public String addPod(OfficePod pod) {

		if (pod.getName().isEmpty()) {
			return "POD NAME EMPTY";
		}

		for (OfficePod officePod : pods) {
			if (officePod.getName().equals(pod.getName())) {
				return "POD ALREADY EXISTS";
			}
		}

		pods.add(pod);
		return "POD ADDED";
	}

	// User Story 3
	public int getNumberOfPodsInUse() {

		int count = 0;

		for (OfficePod pod : pods) {
			if (pod.isBooked()) {
				count++;
			}
		}

		return count;
	}

	// User Story 4
//	public String bookPod(String bookedBy, boolean videoRequired) {
//
//		for (OfficePod pod : pods) {
//
//			if (!pod.isBooked()) {
//
//
//		return "NO POD AVAILABLE";
//	}

	// User Story 5
	public ArrayList<String> getPodsBookedBy(String bookedBy) {

		ArrayList<String> result = new ArrayList<>();

		for (OfficePod pod : pods) {

			if (pod.getBookedBy().equals(bookedBy)) {
				result.add(pod.getName());
			}
		}

		return result;
	}

}


