package con.jdc.mkt.insterfaceTest;

 interface Animal {
	 
	 String name = "KK";
	 static int age = 12;
	 
	
	 static void show() {}
	 default void hide() {}

	 void eat();
	 void sleep();
	
}

 
