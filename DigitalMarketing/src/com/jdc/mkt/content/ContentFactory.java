package com.jdc.mkt.content;

import com.jdc.mkt.abstractTest.AbstractFactory;
import com.jdc.mkt.noti.Notification;

public class ContentFactory extends AbstractFactory {


	@Override
	public Writer getWriter(String content) {
		if (content.equals("fb")) {
			return new FacebookContent();
		} else if (content.equals("vb")) {
			return new ViberContent();
		} else {
			return null;
		}
	}

	@Override
	public Notification getNotifaction(String str) {
		return null;
	}
}
