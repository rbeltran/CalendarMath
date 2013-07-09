package com.jphat.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonthsTest {
	
	Month classUnderTest;

	@Test
	public void februaryTest() {
		classUnderTest = Month.February;
		classUnderTest.setYear(2001);
		assertEquals( 28, classUnderTest.daysInMonth());
		classUnderTest.setYear(2000);
		assertEquals( 29, classUnderTest.daysInMonth());
		classUnderTest.setYear(2014);
		assertEquals( 28, classUnderTest.daysInMonth());
		classUnderTest.setYear(2016);
		assertEquals( 29, classUnderTest.daysInMonth());
		
	}

	@Test
	public void monthTest() {
		assertEquals(Month.January.daysInMonth(), 31);
		assertEquals(Month.March.daysInMonth(), 31);
		assertEquals(Month.April.daysInMonth(), 30);
		assertEquals(Month.May.daysInMonth(), 31);
		assertEquals(Month.June.daysInMonth(), 30);
		assertEquals(Month.July.daysInMonth(), 31);
		assertEquals(Month.August.daysInMonth(), 31);
		assertEquals(Month.September.daysInMonth(), 30);
		assertEquals(Month.October.daysInMonth(), 31);
		assertEquals(Month.November.daysInMonth(), 30);
		assertEquals(Month.December.daysInMonth(), 31);
	}
}
