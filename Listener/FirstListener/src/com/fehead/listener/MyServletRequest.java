package com.fehead.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequest implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		
		System.out.println("requestDestroyed");
	}

	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		String name = servletRequestEvent.getServletRequest().getParameter("name");
		System.out.println("requestInitialized name:"+name);
	}

}
