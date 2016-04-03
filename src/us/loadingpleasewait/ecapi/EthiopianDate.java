package us.loadingpleasewait.ecapi;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

/**
 * A date in the Ethiopian calendar system
 */
public class EthiopianDate implements ChronoLocalDate {

	/* (non-Javadoc)
	 * @see java.time.temporal.Temporal#isSupported(java.time.temporal.TemporalUnit)
	 */
	@Override
	public boolean isSupported(TemporalUnit unit) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.time.temporal.Temporal#with(java.time.temporal.TemporalField, long)
	 */
	@Override
	public Temporal with(TemporalField field, long newValue) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.temporal.Temporal#plus(long, java.time.temporal.TemporalUnit)
	 */
	@Override
	public Temporal plus(long amountToAdd, TemporalUnit unit) {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}

	/* (non-Javadoc)
	 * @see java.time.temporal.TemporalAccessor#isSupported(java.time.temporal.TemporalField)
	 */
	@Override
	public boolean isSupported(TemporalField field) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.time.temporal.TemporalAccessor#getLong(java.time.temporal.TemporalField)
	 */
	@Override
	public long getLong(TemporalField field) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.time.temporal.TemporalAdjuster#adjustInto(java.time.temporal.Temporal)
	 */
	@Override
	public Temporal adjustInto(Temporal temporal) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ChronoLocalDate o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.ChronoLocalDate#getChronology()
	 */
	@Override
	public Chronology getChronology() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.ChronoLocalDate#lengthOfMonth()
	 */
	@Override
	public int lengthOfMonth() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.ChronoLocalDate#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
	 */
	@Override
	public long until(Temporal endExclusive, TemporalUnit unit) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.time.chrono.ChronoLocalDate#until(java.time.chrono.ChronoLocalDate)
	 */
	@Override
	public ChronoPeriod until(ChronoLocalDate endDateExclusive) {
		// TODO Auto-generated method stub
		return null;
	}

}
