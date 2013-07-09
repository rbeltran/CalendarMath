package com.jphat.util;

public class Date {
	
	private int dayOfMonth;
	private Month month;
	private int year;
	
	private static final int YEAR_MIN = 1900;
	private static final int YEAR_MAX = 2999;
	private static final String DELIMETER = "-";
	/**
	 * 
	 * @param date
	 * @throws DateParseException 
	 */
	public void parseDate( String date ) throws DateParseException {
		String[] dateChunks = date.split(DELIMETER);
		if( dateChunks.length != 3 ) {
			throw new DateParseException( "Date not properly formatted, "+date+" should have been in the form DD-MM-YYYY");
		}
		try {
			year = Integer.parseInt(dateChunks[2]);
			if( year > YEAR_MAX ||
				year < YEAR_MIN ) {
				throw new DateParseException( "Year field for "+date+" is beyond the valid range of "
					+YEAR_MIN+" and "+YEAR_MAX );
			}
		} catch( NumberFormatException nfe ) {
			throw new DateParseException("Year field for "+date+" did not parse properly");
		}
		
		try {
			month = Month.values()[Integer.parseInt( dateChunks[1] )];
		} catch( Exception ex ) {
			// covers Array Index Out of Bounds
			throw new DateParseException("Month field for "+date+" did not parse properly");
		}
		
		try {
			dayOfMonth = Integer.parseInt( dateChunks[0] );
			month.setYear( this.year );
			if( dayOfMonth > month.daysInMonth() ) {
				throw new DateParseException("Day field for "+date+" was out of range for month "+month.toString());
			}
		} catch( NumberFormatException nfe ) {
			throw new DateParseException("Day field for "+date+" did not parse properly");
		}
	}
}
