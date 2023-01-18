package con.jdc.mkt.abstracttest;

import java.util.Scanner;

public class AbstractTestDemo {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		Animal an = selectAnimal();
		checkStatusOfFood(an);
		checkStatusOfMedicalCare(an);
		Animal an1 = new Bird();
		Animal t = new Tiger();
		Bird b = (Bird) t;
		
	}

	static Animal selectAnimal() {

		System.out.println("""
				Check Animal

				1.Tiger
				2.Bird
				3.Leopard

				""");
		int res = sc.nextInt();
		
		return switch (res) {
		
		case 1 -> new Tiger();
		case 2 -> new Bird();
		case 3 ->new Leopard();
		default ->  null;
		};
	}

	static void checkStatusOfFood(Animal an) {

		if (an.eatYet()) {
			System.out.println("Finished .");
		} else {
			System.out.println("Not Yet");
		}
	}

	static void checkStatusOfMedicalCare(Animal an) {
		if (an.checkMedicalCare()) {
			System.out.println("Alerady checked.");
		} else {
			System.out.println("Not yet");
		}
	}
}
