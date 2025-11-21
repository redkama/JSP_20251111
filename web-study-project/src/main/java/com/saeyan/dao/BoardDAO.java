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
	} // end selectAllBoards

	
	public void insertBoard(BoardVO bVo) {
		
		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "insert into board(name, email, pass, title, content)"
				+ "values(?, ?, ?, ?, ?)";
		
		
		
		try {
			//1. DB연결
			con = DBManager.getConnection();
			
			//2. sql전송
			pstmt = con.prepareStatement(sql);
			
			//3. sql맵핑
			pstmt.setString(1, bVo.getName());
			pstmt.setString(2, bVo.getEmail());
			pstmt.setString(3, bVo.getPass());
			pstmt.setString(4, bVo.getTitle());
			pstmt.setString(5, bVo.getContent());
			
			//4. sql실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt);
		}

		
	} // end insertBoard

	public BoardVO selectOneByNum(int num) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO bVo = new BoardVO();
		
		String sql = "select * from board where num = ?";
		
		try {
			con = DBManager.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				bVo.setNum(rs.getInt("num"));
				bVo.setName(rs.getString("name"));
				bVo.setPass(rs.getString("pass"));
				bVo.setEmail(rs.getString("email"));
				bVo.setTitle(rs.getString("title"));
			    bVo.setContent(rs.getString("content"));
			    bVo.setReadcount(rs.getInt("readcount"));
				bVo.setWritedate(rs.getTimestamp("writedate"));
			    
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		
		return bVo;
	}

	public void updateReadCount(int num) {

		String sql = "update board set readcount = readcount+1 where num = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. DB연결
			con = DBManager.getConnection();
			
			//2. sql전송
			pstmt = con.prepareStatement(sql);
			
			//3. sql맵핑
			pstmt.setInt(1, num);
			
			//4. sql실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt);
		}
		
	} // end updateReadCount

	public void deleteBoard(int num) {

		String sql = "delete from board where num = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. DB연결
			con = DBManager.getConnection();
			
			//2. sql전송
			pstmt = con.prepareStatement(sql);
			
			//3. sql맵핑
			pstmt.setInt(1, num);
			
			//4. sql실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt);
		}
	} //end deleteBoard

	public void updateBoard(BoardVO bVo) {
		
		String sql = "update board set name=?, email=?, pass=?, title=?, content=? where num=?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. DB연결
			con = DBManager.getConnection();
			
			//2. sql전송
			pstmt = con.prepareStatement(sql);
			
			//3. sql맵핑
			pstmt.setString(1, bVo.getName());
			pstmt.setString(2, bVo.getEmail());
			pstmt.setString(3, bVo.getPass());
			pstmt.setString(4, bVo.getTitle());
			pstmt.setString(5, bVo.getContent());
			pstmt.setInt(6, bVo.getNum());
			
			//4. sql실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt);
		}
		
	}

	
}
