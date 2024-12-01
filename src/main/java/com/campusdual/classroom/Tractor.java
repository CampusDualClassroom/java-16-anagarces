package com.campusdual.classroom;

public class Tractor implements IMachine{

	protected int horsePower = 0;
	
	public Tractor(int hp) {

		this.horsePower = hp;
	}

	@Override
	public void start() {
		System.out.println("O tractor está acendido");
	}

	@Override
	public void stop() {
		System.out.println("O tractor está apagado");
	}

	@Override
	public void maintenance() {
		System.out.println("O tractor está en mantemento");
	}

	public void forward() {
		System.out.println("El tractor avanza");
	}

	public void backward() {
		System.out.println("El tractor retrocede");
	}

}
