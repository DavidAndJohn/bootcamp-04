package con.jdc.mkt.insterfaceTest;

public class Cat implements Feline,Animal{

	@Override
	public void makeSound() {
		System.out.println("Meow");
	}

	@Override
	public void eat() {
	System.out.println("Meals");	
	}

	@Override
	public void sleep() {
		System.out.println("On Ground");
	}

}
