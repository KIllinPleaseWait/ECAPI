package us.loadingpleasewait.ecapi;

import java.time.chrono.AbstractChronology;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Era;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.ValueRange;
import java.util.List;

/**
 * Ethiopian calendar system
 */
public class EthiopianChronology extends AbstractChronology {

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#getId()
	 */
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#getCalendarType()
	 */
	@Override
	public String getCalendarType() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#date(int, int, int)
	 */
	@Override
	public ChronoLocalDate date(int prolepticYear, int month, int dayOfMonth) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#dateYearDay(int, int)
	 */
	@Override
	public ChronoLocalDate dateYearDay(int prolepticYear, int dayOfYear) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#dateEpochDay(long)
	 */
	@Override
	public ChronoLocalDate dateEpochDay(long epochDay) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#date(java.time.temporal.TemporalAccessor)
	 */
	@Override
	public ChronoLocalDate date(TemporalAccessor temporal) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#isLeapYear(long)
	 */
	@Override
	public boolean isLeapYear(long prolepticYear) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#prolepticYear(java.time.chrono.Era, int)
	 */
	@Override
	public int prolepticYear(Era era, int yearOfEra) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#eraOf(int)
	 */
	@Override
	public Era eraOf(int eraValue) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#eras()
	 */
	@Override
	public List<Era> eras() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.Chronology#range(java.time.temporal.ChronoField)
	 */
	@Override
	public ValueRange range(ChronoField field) {
		// TODO Auto-generated method stub
		return null;
	}

}
