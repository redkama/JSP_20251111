package com.saeyan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;


@WebServlet("/memberUpdate.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		
		MemberDAO mDao = MemberDAO.getIsntance();
		
		MemberVO mVo = mDao.getMember(userid);
		
		
		request.setAttribute("mVo", mVo);
		
		//회원정보 수정폼에 mVO값을 전달
		request.getRequestDispatcher("member/memberUpdate.jsp").forward(request, response);
		   
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		//수정정보 가져오기
		MemberVO mVo = new MemberVO();
		mVo.setName(request.getParameter("name"));
		mVo.setUserid(request.getParameter("userid"));
		mVo.setPwd(request.getParameter("pwd"));
		mVo.setEmail(request.getParameter("email"));
		mVo.setPhone(request.getParameter("phone"));
		mVo.setAdmin(Integer.parseInt(request.getParameter("admin")));
		
		//수정정보를 DB에 저장
		MemberDAO mDao = MemberDAO.getIsntance();
		mDao.updateMember(mVo);
		
		
		//수정이 완료되면 화면전환
		response.sendRedirect("login.do");
	}

}
