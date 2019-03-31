package com.fehead.entity;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class User implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable {

	private String username;
	private String password;
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
		
		System.out.println("valueBound:"+httpSessionBindingEvent.getName());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
		
		System.out.println("valueUnbound:"+httpSessionBindingEvent.getName());
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
		
		System.out.println("sessionDidActivate:"+httpSessionEvent.getSource());
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
		
		System.out.println("sessionWillPassivate:"+httpSessionEvent.getSource());
	}

}
