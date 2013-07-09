package com.jphat.util;

public class CalendarMath {

	public void printUsage() {
		System.out.println( "\nUsage: \nCalendarMath <date1> <date2> ");
	}
	
	public static void main( String args[] ) {
		CalendarMath cm = new CalendarMath();
		if( args.length != 2 ) {
			cm.printUsage();
			return;
		}
		
		
	}
}
