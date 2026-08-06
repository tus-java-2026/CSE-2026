package com.tus.office;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmartOfficeTest {
	private SmartOffice office;

	private OfficePod pod1;
	private OfficePod pod2;
	private OfficePod pod3;

	@BeforeEach
	public void setUp() {

		office = new SmartOffice();

		pod1 = new OfficePod("W301", false);
		pod2 = new OfficePod("W302", true);
		pod3 = new OfficePod("W303", true);
	}
	// Test 1-1
	@Test
	void testZeroPods() {

		assertEquals(0, office.getTotalPods());
	}


	// Test 2-1
	@Test
	void testAddPodOK() {
		assertEquals("POD ADDED", office.addPod(pod1));
		assertEquals(1, office.getTotalPods());
	}


	// Test 2-2
	@Test
	void testAddPodEmptyName() {
		OfficePod pod = new OfficePod("", false);

		assertEquals("POD NAME EMPTY", office.addPod(pod));
		assertEquals(0, office.getTotalPods());
	}


	// Test 2-3
	@Test
	void testAddDuplicatePodName() {
		office.addPod(pod1);

		OfficePod duplicate = new OfficePod("W301", true);

		assertEquals("POD ALREADY EXISTS", office.addPod(duplicate));
		assertEquals(1, office.getTotalPods());
	}


	// Test 3-1
	@Test
	void testNoPodsInUse() {
		office.addPod(pod1);
		office.addPod(pod2);

		assertEquals(0, office.getNumberOfPodsInUse());
	}


	// Test 4-1
	@Test
	void testBookPodWithoutVideoOk() {
		office.addPod(pod1);

		assertEquals("BOOKED POD: W301",
				office.bookPod("Donald"));

		assertEquals(1, office.getNumberOfPodsInUse());
	}

	// Test 4-2
	@Test
	void testBookPodWithoutVideoNotAvailable() {
		office.addPod(pod1);

		office.bookPod("Donald", false);

		assertEquals("NO SUITABLE POD AVAILABLE")
				office.bookPod("Elon", false));

		assertEquals(1, office.getNumberOfPodsInUse());
	}

	// Test 4-3
	@Test
	void testBookPodWithVideoOk() {
		office.addPod(pod1);
		office.addPod(pod2);

		assertEquals("BOOKED POD: W302",
				office.bookPod("Donald", true));

		assertEquals(1, office.getNumberOfPodsInUse());
	}


	// Test 4-4
	@Test
	void testBookPodWithVideoNotAvailable() {
		office.addPod(pod1);
		office.addPod(pod2);

		office.bookPod("Donald", true);

		assertEquals("NO SUITABLE POD AVAILABLE",
				office.bookPod("Elon", true));

		assertEquals(1, office.getNumberOfPodsInUse());
	}


	// Test 5-1
	@Test
	void testGetPodsBookedByOneUser() {
		

	        office.addPod(pod1);

	        office.bookPod("Donald", false);

	        ArrayList<String> result = office.getPodsBookedBy("Donald");

	        assertEquals(1, result.size());
	        assertEquals("W301", result.get(0));
	    }
	

	// Test 5-2
	@Test
	void testGetMultiplePodsBookedByOneUser() {
		 office.addPod(pod1);
	        office.addPod(pod2);

	        office.bookPod("Donald", false);
	        office.bookPod("Donald", true);

	        ArrayList<String> result = office.getPodsBookedBy("Donald");

	        assertEquals(2, result.size());
	        assertEquals("W301", result.get(0));
	        assertEquals("W302", result.get(1));
	    }
	

	// Test 5-3
	@Test
	void testGetPodsBookedByDifferentUsers() {
		
	        office.addPod(pod1);
	        office.addPod(pod2);
	        office.addPod(pod3);

	        office.bookPod("Elon", false);
	        office.bookPod("Donald", true);

	        ArrayList<String> result = office.getPodsBookedBy("Elon");

	        assertEquals(1, result.size());
	        assertEquals("W301", result.get(0));
	    }
	

	// Test 5-4
	@Test
	void testGetPodsBookedByUnknownUser() {
		 office.addPod(pod1);

	        office.bookPod("Donald", false);

	        ArrayList<String> result = office.getPodsBookedBy("John");

	        assertEquals(0, result.size());
	    }

	}

