package com.saeyan.controlle;

import com.saeyan.controlle.Action.Action;
import com.saeyan.controlle.Action.FruitControltAction;
import com.saeyan.controlle.Action.FruitHomeAction;
import com.saeyan.controlle.Action.FruitItemAction;
import com.saeyan.controlle.Action.FruitJoinAction;
import com.saeyan.controlle.Action.FruitNDPAction;
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
			action=new FruitControltAction();
			
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
			
		}
		return action;
	}
}
