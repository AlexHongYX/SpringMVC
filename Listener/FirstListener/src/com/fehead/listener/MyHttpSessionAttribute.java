package com.fehead.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttribute implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		
		System.out.println("HttpSession_attributeAdded:"+httpSessionBindingEvent.getName());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		
		System.out.println("HttpSession_attributeRemoved:"+httpSessionBindingEvent.getName());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
		
		System.out.println("HttpSession_attributeReplaced:"+httpSessionBindingEvent.getName());
	}

}
