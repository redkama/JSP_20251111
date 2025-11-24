package com.saeyan.controller;

import com.saeyan.controller.action.Action;
import com.saeyan.controller.action.BoardCheckPassAction;
import com.saeyan.controller.action.BoardCheckPassFormAction;
import com.saeyan.controller.action.BoardDeleteAction;
import com.saeyan.controller.action.BoardListAction;
import com.saeyan.controller.action.BoardUpdateAction;
import com.saeyan.controller.action.BoardUpdateFormAction;
import com.saeyan.controller.action.BoardViewAction;
import com.saeyan.controller.action.BoardWriteAction;
import com.saeyan.controller.action.BoardWriteFormAction;
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
		
		} else if(command.equals("board_list")) {
			action = new BoardListAction();
			
		} else if(command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
			
		} else if(command.equals("board_write")) {
			action = new BoardWriteAction();
			
		} else if(command.equals("board_view")) {
			action = new BoardViewAction();
			
		} else if(command.equals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
			
		} else if(command.equals("board_check_pass")) {
			action = new BoardCheckPassAction();
			
		} else if(command.equals("board_delete")) {
			action = new BoardDeleteAction();
			
		}
		else if(command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
			
		}
		else if(command.equals("board_update")) {
			action = new BoardUpdateAction();
			
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
 