package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Laptop {

	int Lid;
	String Lname;

	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}
}
