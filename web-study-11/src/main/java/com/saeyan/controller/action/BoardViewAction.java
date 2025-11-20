package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. num 가져오기
		int num = Integer.parseInt(request.getParameter("num"));
		
		//2. DB에서 num 해당하는 값 가져오기
		BoardDAO bDao = BoardDAO.getInstance();
		BoardVO bVo = bDao.selectOneByNum(num);
		
		//3. boardView에 값 전달하기
		request.setAttribute("board", bVo);
		
		String url = "board/boardView.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
		
		
	}

}
