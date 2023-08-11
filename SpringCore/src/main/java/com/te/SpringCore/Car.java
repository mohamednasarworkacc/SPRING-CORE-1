package com.te.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle {
	
	@Autowired
	private Tyre t;
	
	public Tyre getTyre() {
		return t;
	}

	public void setTyre(Tyre t) {
		this.t = t;
	}

	public void drive()
	{
		System.out.println("had nothing");
	}

}
