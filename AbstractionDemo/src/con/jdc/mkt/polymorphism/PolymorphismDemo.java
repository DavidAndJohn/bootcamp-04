package con.jdc.mkt.polymorphism;

public class PolymorphismDemo {

	public static void main(String[] args) {

		Animal a1 = new Lion();
	
		
		Lion lion = new Lion();
		Zoo z = new Lion();
		Object o = new Lion();
		
		lion.setMeal("meats");
		lion.getCage();
		lion.eat();

		//
		Parriot p = new Parriot();
		p.setMeal("insects");
		p.getCage();
		p.eat();

	}
}

interface Animal {
	void eat();
}

abstract class Zoo {

	String food;

	void getCage() {
		System.out.println("Animal are in cage !");
	}

	abstract void setMeal(String meal);

	abstract String getMeal();
}

class Lion extends Zoo implements Animal {

	@Override
	public void eat() {
		System.out.println("Lion is eating " + getMeal());
	}

	@Override
	void setMeal(String meal) {
		food = meal;
	}

	@Override
	String getMeal() {
		return food;
	}

}

class Parriot extends Zoo implements Animal {

	@Override
	public void eat() {
		System.out.println("Parriot is eating " + getMeal());
	}

	@Override
	void setMeal(String meal) {
		food = meal;
	}

	@Override
	String getMeal() {
		return food;
	}

}
