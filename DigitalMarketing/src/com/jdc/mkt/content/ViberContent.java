package com.jdc.mkt.content;

public class ViberContent extends Writer {

	@Override
	public void getWrite(String message) {
		System.out.println("Viber message :"+message);
	}

}
