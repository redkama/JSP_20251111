package com.saeyan.controller;

import com.saeyan.controller.action.FruitRequestAction;
import com.saeyan.controller.action.FruitControlAction;
import com.saeyan.controller.action.FruitCheckPassAction;
import com.saeyan.controller.action.FruitCheckPassFormAction;
import com.saeyan.controller.action.FruitDeleteAction;
import com.saeyan.controller.action.FruitJoinAction;
import com.saeyan.controller.action.FruitNDPAction;
import com.saeyan.controller.action.FruitNDPformAction;
import com.saeyan.controller.action.FruitNDPwriteAction;
import com.saeyan.controller.action.FruitPDPAction;
import com.saeyan.controller.action.FruitUDPAction;
import com.saeyan.controller.action.Action;
import com.saeyan.controller.action.FruitHomeAction;
import com.saeyan.controller.action.FruitLoginAction;
import com.saeyan.controller.action.ProductDeleteAction;
import com.saeyan.controller.action.ProductListAction;
import com.saeyan.controller.action.ProductUpdateAction;
import com.saeyan.controller.action.ProductUpdateFormAction;
import com.saeyan.controller.action.ProductWriteAction;
import com.saeyan.controller.action.ProductWriteFormAction;

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
		
		//조건문
		if(command.equals("fruit_home")) {
			action = new FruitHomeAction();
			
		}else if (command.equals("fruit_login")) {
			action = new FruitLoginAction();
		
		}
		
		
		else if (command.equals("fruit_Request")) {
			action=new FruitRequestAction();
			
		}else if (command.equals("fruit_Control")) {
			action=new FruitControlAction();
			
		
			
		}else if (command.equals("fruit_Join")) {
			action=new FruitJoinAction();
			
		}else if (command.equals("fruit_PDP")) {
			action=new FruitPDPAction();
			
		}else if (command.equals("fruit_NDP")) {
			action=new FruitNDPAction();
			
		}else if (command.equals("fruit_UDP")) {
			action=new FruitUDPAction();
			
		}else if (command.equals("fruit_NDP_form")) {
			action=new FruitNDPformAction();
			
		}else if (command.equals("fruit_write")) {
			action=new FruitNDPwriteAction();
			
		}else if (command.equals("fruit_check_pass_form")) {
			action=new FruitCheckPassFormAction();
			
		}else if (command.equals("fruit_check_pass")) {
			action=new FruitCheckPassAction();
			
		}else if (command.equals("fruit_delete")) {
			action=new FruitDeleteAction();
		}

		
		
		
		 else if(command.equals("product_list")) {
		action = new ProductListAction();
		
		} 
		
		 else if(command.equals("product_update_form")) {
				action = new ProductUpdateFormAction();
				
		}
		
		 else if(command.equals("product_update")) {
				action = new ProductUpdateAction();
				
		}
		
		 else if(command.equals("product_delete")) {
				action = new ProductDeleteAction();
				
		}
		
		 else if(command.equals("product_write_form")) {
				action = new ProductWriteFormAction();
				
		}
		
		 else if(command.equals("product_write")) {
				action = new ProductWriteAction();
				
		}
		
		
		
		
		
		
		return action;
		
	}
	
}
 