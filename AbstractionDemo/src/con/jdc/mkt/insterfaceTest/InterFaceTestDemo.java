package con.jdc.mkt.insterfaceTest;

public class InterFaceTestDemo {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.makeSound();
		
		Feline f = new Cat();
		
		f.makeSound();
		
		Animal an = new Cat();
		an.eat();
		an.sleep();
		
	}
}
