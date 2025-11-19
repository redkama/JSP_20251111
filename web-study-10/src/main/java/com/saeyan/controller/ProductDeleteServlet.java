package com.saeyan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.ProductDAO;
import com.saeyan.dto.ProductVO;


@WebServlet("/productDelete.do")
public class ProductDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProductDeleteServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. code 획득
		String code = request.getParameter("code");
		
		
		//2. DB에서 code에 해당하는 값 가져오기 
		ProductDAO pDao = ProductDAO.getInstance();
		ProductVO pVo = pDao.slectProductByCode(code);
		
		//3. request.setAttribute() 저장
		request.setAttribute("product", pVo);
		
		//4. forword
		request.getRequestDispatcher("product/productDlete.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. code 획득
		int code = Integer.parseInt(request.getParameter("code"));
	
		//2. DB에서 code에 해당하는 값 삭제 
		ProductDAO pDao = ProductDAO.getInstance();
		pDao.deleteProduct(code);
		
		//3. redirect
		response.sendRedirect("ProductList.do");
	
	
	}

}
