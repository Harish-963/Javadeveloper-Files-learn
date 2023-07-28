package com.practice.spring.di;

public class Student {

	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void cheatingExam() {
		cheat.cheating();
	}

}
