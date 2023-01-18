package com.jdc.mkt.srp;

public class Man {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// bad code

//	void doWork() {
//		System.out.println("do Something");
//	}
//	
//	void saveToDatabase() {
//		System.out.println("Save to database");
//	}
//	
//	void checkAge() {
//		//----
//	}
}

class ManBusinessLogic {
	
	void doWork() {
		System.out.println("do Something");
	}
	void checkAge() {
		//---
	}
}

class ManDb{
	void saveToDatabase() {
		System.out.println("Save to database");
	}
}
