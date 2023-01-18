package com.jdc.mkt.abstractTest;

import com.jdc.mkt.content.ContentFactory;
import com.jdc.mkt.noti.NotificationFactory;

public class MarketingFactory {

	public AbstractFactory getFactory(String str) {
		if (str.equals("noti")) {
			return new NotificationFactory();
		} else if (str.equals("content")) {
			return new ContentFactory();
		} else {
			return null;
		}
	}
}
