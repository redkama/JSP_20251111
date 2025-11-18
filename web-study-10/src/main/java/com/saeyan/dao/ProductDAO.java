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
	
	private ProductDAO() {}
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	
	//전체 데이터 가져오기
	public List<ProductVO> selectAllProducts() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from product order by code desc";
		List<ProductVO> list = new ArrayList<ProductVO>();
		ProductVO pVo = null;
		
		try {
			//1. DB연결
			con = DBManager.getConnection();
			
			//2. sql 구문 전송
			pstmt = con.prepareStatement(sql);
			
			//3. sql 구문 맵핑
			
			//4. sql 실행
			rs = pstmt.executeQuery();
			
			//5. 가져온 데이터 VO 클래스 저장
			while(rs.next()) {
				pVo = new ProductVO();
				
				pVo.setCode(rs.getInt("code"));
				pVo.setName(rs.getString("name"));
				pVo.setPrice(rs.getInt("price"));
				pVo.setPictureUrl(rs.getString("pictureurl"));
				pVo.setDescription(rs.getString("description"));
				
				list.add(pVo);
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return list;
		
	}
	
}
