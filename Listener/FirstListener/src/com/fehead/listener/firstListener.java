package com.fehead.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class firstListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		
		System.out.println("contextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		String initParam = servletContextEvent.getServletContext().getInitParameter("initParam");
		System.out.println("contextInitialized:initParam = " + initParam);
	}

}
