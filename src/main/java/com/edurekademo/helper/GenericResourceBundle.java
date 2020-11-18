package com.edurekademo.helper;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class GenericResourceBundle {
	public static String getProperties(String source){
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle");
		Enumeration <String> keys = rb.getKeys();
		String value="";
		//test
		while (keys.hasMoreElements()) {
			
			String key =  keys.nextElement();
			
		}
		return value;
	}
	
}

