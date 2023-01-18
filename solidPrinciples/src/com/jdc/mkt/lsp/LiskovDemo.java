package com.jdc.mkt.lsp;

public class LiskovDemo {

	public static void main(String[] args) {
		
		Car car = new EngineCar();
		car.drive();
		car.useEngine();
	}
}

interface Car{
	void useEngine();
	void drive();
}

interface Battery{
	void useBattery();
}

class BatteryCar implements Car,Battery{

	@Override
	public void useEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void useBattery() {
		// TODO Auto-generated method stub
		
	}
	
}

class EngineCar implements Car{

	@Override
	public void useEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
	
}
