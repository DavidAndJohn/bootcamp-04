package con.jdc.mkt.insterfaceTest;

public class DiamondProblemDemo {

	public static void main(String[] args) {
		D d = new D();
		d.doSome();
	}
}

interface A{
	default void show() {
		System.out.println("Showing A");
	}
}
interface B extends A{
	@Override
	default void show() {
		A.super.show();
	}
}
interface C extends A{
	@Override
	default void show() {
		A.super.show();
	}
}

class D implements B,C{
	void doSome() {
	
	}

	@Override
	public void show() {
		B.super.show();
	}

	
}
