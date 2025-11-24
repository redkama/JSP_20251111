package com.saeyan.controlle;

import com.saeyan.controlle.Action.Action;
import com.saeyan.controlle.Action.FruitCheckPassAction;
import com.saeyan.controlle.Action.FruitCheckPassFormAction;
import com.saeyan.controlle.Action.FruitControlAction;
import com.saeyan.controlle.Action.FruitDeleteAction;
import com.saeyan.controlle.Action.FruitHomeAction;
import com.saeyan.controlle.Action.FruitItemAction;
import com.saeyan.controlle.Action.FruitJoinAction;
import com.saeyan.controlle.Action.FruitNDPAction;
import com.saeyan.controlle.Action.FruitNDPformAction;
import com.saeyan.controlle.Action.FruitNDPwriteAction;
import com.saeyan.controlle.Action.FruitPDPAction;
import com.saeyan.controlle.Action.FruitRequestAction;
import com.saeyan.controlle.Action.FruitUDPAction;
import com.saeyan.controlle.Action.FruitloginAction;


public class ActionFactory{

private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	public static ActionFactory getInstance() {
		return instance;
	}
	public Action getAction(String command) {
		Action action = null;
		
		System.out.println("ActionFactory : " + command);
		
		if(command.equals("fruit_home")) {
			action = new FruitHomeAction();
			
		}else if (command.equals("fruit_login")) {
			action=new FruitloginAction();
			
		}else if (command.equals("fruit_Request")) {
			action=new FruitRequestAction();
			
		}else if (command.equals("fruit_Control")) {
			action=new FruitControlAction();
			
		}else if (command.equals("fruit_Item")) {
			action=new FruitItemAction();
			
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
		return action;
	}
}
