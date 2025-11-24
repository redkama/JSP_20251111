package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. 값 가져오기
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardVO bVo = new BoardVO();
		bVo.setName(name);
		bVo.setPass(pass);
		bVo.setEmail(email);
		bVo.setTitle(title);
		bVo.setContent(content);
		
		//2. DAO 통해 DB저장
		BoardDAO bDao = BoardDAO.getInstance();
		
		bDao.insertBoard(bVo);
		
		
		//3. 화면 전환
		// Post -> Redirect -> Get (PRG방식)
		response.sendRedirect("FruitServlet?command=board_list");
//		new BoardListAction().execute(request, response);
	}

}
