package com.fehead.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttribute implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		
		System.out.println("ServletRequest_attributeAdded:"+servletRequestAttributeEvent.getName());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		
		System.out.println("ServletRequest_attributeRemoved:"+servletRequestAttributeEvent.getName());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		
		System.out.println("ServletRequest_attributeReplaced:"+servletRequestAttributeEvent.getName());
	}

}
