package con.jdc.mkt.encapsulationTest;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Duty du = new Human();
		//du.name = "";
		du.setName("KK");
		du.washFace();
		
	}
}

interface Duty{
	void washFace();
	void setName(String name);
}

class Human implements Duty{
	
	public String name;
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void washFace() {
		System.out.println(getName()+" is Wash face with hot water");
	}
	
	public String getName() {
		return name;
	}
	public void useFacialForm() {
		System.out.println(getName()+"is wash face with facialForm");
	}
	
}
