package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.ProductVO;

import util.DBManager;

public class ProductDAO {
	
	private static ProductDAO instance = new ProductDAO();
	
	private ProductDAO() {
		
	}
	
	public static ProductDAO getInstance() {
		return instance;
	}

	public List<ProductVO> selectAllProducts() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from product order by code desc";
		
		List<ProductVO> list = new ArrayList<ProductVO>();
		
		try {
			con = DBManager.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				ProductVO pVo = new ProductVO();
				
				pVo.setNum(rs.getInt("num"));
				pVo.setName(rs.getString("name"));
				
				list.add(pVo);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		
		return list;
	} // end selectAllBoards
	

}
