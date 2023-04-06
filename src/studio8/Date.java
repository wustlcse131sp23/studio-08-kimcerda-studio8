package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	public Date(int m, int d, int y, boolean h) {
		month = m;
		day = d;
		year = y;
		this.holiday = h;
	}
	
	public String toString() {
		if (holiday == true) {
			return "Today is: " + month + "/" + day + "/" + year + ". Today is a holiday.";
		}
		else {
			return "Today is: " + month + "/" + day + "/" + year + ". No holidays today.";
		}
	}
	
    public static void main(String[] args) {
    	Date d1 = new Date(2, 23, 1995, false);
    	Date d2 = new Date(12, 13, 2003, true);
    	Date d3 = new Date(4, 12, 2021, false);
    	Date d4 = new Date(5, 27, 2012, false);
    	Date d5 = new Date(10, 31, 2016, true);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d1); list.add(d2); list.add(d3); list.add(d4); list.add(d5);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1); set.add(d2); set.add(d3); set.add(d4); set.add(d1);
    	System.out.println(list);
    	System.out.println(set);
    	
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}

}
