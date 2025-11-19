package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.saeyan.dto.BoardVO;

import util.DBManager;

public class BoardDAO {
	
	private static BoardDAO instance = new BoardDAO();
	
	private BoardDAO() {
		
	}
	
	public static BoardDAO getInstance() {
		return instance;
	}

	public List<BoardVO> selectAllBoards() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board order by num desc";
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			con = DBManager.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				BoardVO bVo = new BoardVO();
				
				bVo.setNum(rs.getInt("num"));
				bVo.setName(rs.getString("name"));
				bVo.setPass(rs.getString("pass"));
				bVo.setEmail(rs.getString("email"));
				bVo.setTitle(rs.getString("title"));
			    bVo.setContent(rs.getString("content"));
			    bVo.setReadcount(rs.getInt("readcount"));
				bVo.setWritedate(rs.getTimestamp("writedate"));
			    
				/*
				rs.getInt("num")
				rs.getString("name")
				rs.getString("pass")
				rs.getString("email")
				rs.getString("title")
				rs.getString("content")
				rs.getInt("num")
				rs.getInt("readcount")
				rs.getTimestamp("writedate") 
				 */
				
				list.add(bVo);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		
		return list;
	}

	
	
}
