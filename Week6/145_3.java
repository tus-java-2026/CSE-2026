package com.tus.office;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmartOfficeTest {

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

    // ======================
    // User Story 1
    // ======================

    @Test
    public void testZeroPods() {
        assertEquals(0, office.getTotalPods());
    }

    // ======================
    // User Story 2
    // ======================

    @Test
    public void testAddPodOK() {

        assertEquals("POD ADDED", office.addPod(pod1));
        assertEquals(1, office.getTotalPods());
    }

    @Test
    public void testAddPodEmptyName() {

        OfficePod pod = new OfficePod("", false);

        assertEquals("POD NAME EMPTY", office.addPod(pod));
        assertEquals(0, office.getTotalPods());
    }

    @Test
    public void testAddDuplicatePodName() {

        office.addPod(pod1);

        OfficePod duplicate = new OfficePod("W301", true);

        assertEquals("POD ALREADY EXISTS", office.addPod(duplicate));
        assertEquals(1, office.getTotalPods());
    }

    // ======================
    // User Story 3
    // ======================

    @Test
    public void testNoPodsInUse() {

        office.addPod(pod1);
        office.addPod(pod2);

        assertEquals(0, office.getNumberOfPodsInUse());
    }

    // ======================
    // User Story 4
    // ======================

    @Test
    public void testBookPodWithoutVideoOk() {

        office.addPod(pod1);

        assertEquals("BOOKED POD: W301",
                office.bookPod("Donald", false));

        assertEquals(1, office.getNumberOfPodsInUse());
    }

    @Test
    public void testBookPodWithoutVideoNotAvailable() {

        office.addPod(pod1);

        office.bookPod("Donald", false);

        assertEquals("NO SUITABLE POD AVAILABLE",
                office.bookPod("Elon", false));

        assertEquals(1, office.getNumberOfPodsInUse());
    }

    @Test
    public void testBookPodWithVideoOk() {

        office.addPod(pod1);
        office.addPod(pod2);

        assertEquals("BOOKED POD: W302",
                office.bookPod("Donald", true));

        assertEquals(1, office.getNumberOfPodsInUse());
    }

    @Test
    public void testBookPodWithVideoNotAvailable() {

        office.addPod(pod1);
        office.addPod(pod2);

        office.bookPod("Donald", true);

        assertEquals("NO SUITABLE POD AVAILABLE",
                office.bookPod("Elon", true));

        assertEquals(1, office.getNumberOfPodsInUse());
    }

    // ======================
    // User Story 5
    // ======================

    @Test
    public void testGetPodsBookedByOneUser() {

        office.addPod(pod1);

        office.bookPod("Donald", false);

        ArrayList<String> result = office.getPodsBookedBy("Donald");

        assertEquals(1, result.size());
        assertEquals("W301", result.get(0));
    }

    @Test
    public void testGetMultiplePodsBookedByOneUser() {

        office.addPod(pod1);
        office.addPod(pod2);

        office.bookPod("Donald", false);
        office.bookPod("Donald", true);

        ArrayList<String> result = office.getPodsBookedBy("Donald");

        assertEquals(2, result.size());
        assertEquals("W301", result.get(0));
        assertEquals("W302", result.get(1));
    }

    @Test
    public void testGetPodsBookedByDifferentUsers() {

        office.addPod(pod1);
        office.addPod(pod2);
        office.addPod(pod3);

        office.bookPod("Elon", false);
        office.bookPod("Donald", true);

        ArrayList<String> result = office.getPodsBookedBy("Elon");

        assertEquals(1, result.size());
        assertEquals("W301", result.get(0));
    }

    @Test
    public void testGetPodsBookedByUnknownUser() {

        office.addPod(pod1);

        office.bookPod("Donald", false);

        ArrayList<String> result = office.getPodsBookedBy("John");

        assertEquals(0, result.size());
    }

}