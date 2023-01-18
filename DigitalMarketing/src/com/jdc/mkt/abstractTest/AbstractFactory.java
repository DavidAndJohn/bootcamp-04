package com.jdc.mkt.abstractTest;

import com.jdc.mkt.content.Writer;
import com.jdc.mkt.noti.Notification;

public abstract class AbstractFactory {

	public abstract Writer getWriter(String str);
	public abstract Notification getNotifaction(String str);
	
}
