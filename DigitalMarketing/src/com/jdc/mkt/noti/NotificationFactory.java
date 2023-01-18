package com.jdc.mkt.noti;

import com.jdc.mkt.abstractTest.AbstractFactory;
import com.jdc.mkt.content.Writer;

public class NotificationFactory extends AbstractFactory{

	@Override
	public Writer getWriter(String str) {
		return null;
	}

	@Override
	public Notification getNotifaction(String str) {
		return switch (str) {

		case "sms" -> new SMSNotification();
		case "email" -> new EmailNotification();
		default -> null;
		};
	}
}
