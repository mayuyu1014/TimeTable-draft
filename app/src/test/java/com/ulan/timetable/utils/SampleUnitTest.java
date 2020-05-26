package com.ulan.timetable.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class SampleUnitTest {

    @Test
    public void addNumbers() {
        //create an object sampleUnite
        SampleUnit su = new SampleUnit();
        assertEquals(30, su.addNumbers(10,20));
    }
}