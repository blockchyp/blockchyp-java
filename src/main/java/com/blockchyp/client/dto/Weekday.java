package com.blockchyp.client.dto;

public enum Weekday {
	SUNDAY(0),
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6);
	
	public final int code;
	
	private Weekday(int code) {
		this.code = code;
	}

}
