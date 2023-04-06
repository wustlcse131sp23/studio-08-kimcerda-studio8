package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Time {
	
	private int hour;
	private int minute;
	private boolean twelveHour;
	
	public Time(int h, int m, boolean t) {
		hour = h;
		minute = m;
		twelveHour = t;
	}
	
	public String toString() {
		if (twelveHour) {
			if (hour>12) {
			return (hour-12) + ":" + minute;
			}
			else {
				return hour + ":" + minute;
			}
		}
		else {
			return hour + ":" + minute;
		}
	}
	

	public static void main(String[] args) {
		Time h1 = new Time (13, 45, true);
		Time h2 = new Time (23, 12, false);
		System.out.println(h1.toString());
    	System.out.println(h2.toString());
    	LinkedList<Time> list= new LinkedList<Time>();
    	list.add(h1); list.add(h2); list.add(h1);
    	System.out.println(list);

    	
    	HashSet<Time> set = new HashSet<Time>();
    	set.add(h2);
    	set.add(h1);
    	System.out.println(set);
    }
	
}