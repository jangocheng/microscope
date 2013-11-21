package com.vipshop.microscope.mysql.report;

import com.vipshop.microscope.common.util.CalendarUtil;

public abstract class AbstraceReport {
	
	protected int year;
	protected int month;
	protected int week;
	protected int day;
	protected int hour;
	protected int minute;
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setDataByHour(CalendarUtil calendarUtil) {
		this.setYear(calendarUtil.currentYear());
		this.setMonth(calendarUtil.currentMonth());
		this.setWeek(calendarUtil.currentWeek());
		this.setDay(calendarUtil.currentDay());
		this.setHour(calendarUtil.currentHour());
	}
	
	public void setDataByMinute(CalendarUtil calendarUtil) {
		this.setYear(calendarUtil.currentYear());
		this.setMonth(calendarUtil.currentMonth());
		this.setWeek(calendarUtil.currentWeek());
		this.setDay(calendarUtil.currentDay());
		this.setHour(calendarUtil.currentHour());
		this.setMinute((calendarUtil.currentMinute()/5) * 5);
	}
}
