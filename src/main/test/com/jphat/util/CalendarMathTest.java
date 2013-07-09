package com.jphat.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalendarMathTest {

	CalendarMath classUnderTest  = new CalendarMath();
	
	@Test
	public void parseTest() {
		classUnderTest.parseDate( "31-12-2001" );
	}

}
