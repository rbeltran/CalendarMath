package com.jphat.util;

public enum Month {

	January(1, 31),
	February(2, 28),
	March( 3, 31 ),
	April( 4, 30 ),
	May( 5, 31 ),
	June( 6, 30 ),
	July( 7, 31 ),
	August( 8, 31 ),
	September( 9, 30 ),
	October( 10, 31 ),
	November( 11, 30 ),
	December( 12, 31 );
	
	private int monthNumber = -1;
	private int daysInMonth = -1;
	private int year = -1;
	
	private Month(int num, int days ) {
		monthNumber = num;
		daysInMonth = days;
	}
	
	public int getMonthNumber() {
		return monthNumber;
	}
	
	public void setYear( int year ) {
		this.year = year;
	}
	
	private boolean isFebruary() {
		return monthNumber == 2;
	}
	
	public int daysInMonth() {
		if( isFebruary() ) {
			return year % 4 == 0 ? 29 : daysInMonth;
		} 
		return daysInMonth;
	}
}
