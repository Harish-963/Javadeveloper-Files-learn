package com.practice.spring.di;

public class Student2 {

	private MathCheat cheat;



	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}



	public void cheating() {
		cheat.mathCheat();
	}

}
