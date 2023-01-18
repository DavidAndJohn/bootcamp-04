package com.jdc.mkt.dip;

public class DependencyInversionDemo {

	public static void main(String[] args) {
		
		Bike b = new Bike(new BigBoy() );
		b.buy();
	}


}
class Bike{
	
	Type type;
	
	Bike(Type type){
		this.type = type;
	}
	
	void buy() {
		System.out.println(type.getBike()+" Buying ");
	}
}


class SuperCub implements Type{

	@Override
	public String getBike() {
		return "Super Cub";
		
	}
	
}

class BigBoy implements Type{

	@Override
	public String getBike() {
		return "Big Boy";
	}
	
}

interface Type{
	
	String getBike();
}




