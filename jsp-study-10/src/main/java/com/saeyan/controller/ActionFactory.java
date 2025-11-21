package com.saeyan.controller;

import com.saeyan.controller.Action;
import com.saeyan.controller.ActionFactory;

public class ActionFactory {
private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
				
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		System.out.println("ActionFactory : " + command);
		
		if(command.equals("product_list")) {
			action = new ProductListAction();
		} else if(command.equals("product_write")) {
			action = new ProductWriteFormAction();
		} else if(command.equals("product_write_action")) {
			action = new ProductWriteAction();
		
		
		
		return action;
	}
}
