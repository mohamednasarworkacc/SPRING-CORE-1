package com.te.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;

public class Bike implements Vehicle{
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre t) {
		this.tyre = t;
	}
	
	public void drive()
	{
		System.out.println("had r15");
		System.out.println(tyre.getWheels());
	}

}
