package com.pluralsight.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class Exercise {
	@Range(min = 1, max = 120)
	private int minutes;

	@NotNull
	private String Activity;

	public String getActivity() {
		return Activity;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		Activity = activity;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
