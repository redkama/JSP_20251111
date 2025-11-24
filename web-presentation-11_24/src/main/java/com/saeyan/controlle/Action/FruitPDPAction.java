package com.saeyan.controlle.Action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.ProductDAO;
import com.saeyan.dto.ProductVO;

public class FruitPDPAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
		String url = "/Fruit/fruitPDP.jsp";
			
		String code = request.getParameter("code");
			
		ProductDAO pDao = ProductDAO.getInstance();
			
		ProductVO pVo = pDao.slectProductByCode(code);
			
		request.setAttribute("product", pVo);
			
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
