package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		plane.start();
		tractor.start();

		plane.fly();
		plane.takeOff();
		plane.land();

		tractor.forward();
		tractor.backward();

	}


}
