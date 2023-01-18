package con.jdc.mkt.abstracttest;

 abstract class Animal extends Test {
	
	private String name;
	final static int age =23;
	
	 Animal(){
		
	}
	
	
	final static void doSomething() {
		
	}
	
	final void showSomething() {
		System.out.println("Showing");
	}
	
	

	 abstract boolean eatYet();
	abstract boolean checkMedicalCare();
	
}

abstract class Test{}
