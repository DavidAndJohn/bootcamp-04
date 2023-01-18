package com.jdc.mkt;

import com.jdc.mkt.abstractTest.MarketingFactory;

public class Main {

	public static void main(String[] args) {
				
	MarketingFactory mf = new MarketingFactory();
	
	mf.getFactory("noti").getNotifaction("sms").sendNotification();
	mf.getFactory("content").getWriter("fb").getWrite("Testing");
		
	}
}
