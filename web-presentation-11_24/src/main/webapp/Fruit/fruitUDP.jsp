<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
</head>
<body>
	<nav>
        	<ul>
                <li><a href="FruitServilet?command=fruit_home">홈으로</a></li>
                <li><a href="FruitServilet?command=fruit_home">공지사항</a></li>
                <li><a href="FruitServilet?command=fruit_Control">회원관리</a></li>
                <li><a href="FruitServilet?command=fruit_Item">상품목록</a></li>           
            </ul>
        </nav>     	
	<h1>회원 상세 페이지</h1>
	<table>
		<tr>
			<th width="70">번호</th>
			<td>1</td>
		</tr>
		<tr>	
			<th>이름</th>
			<td>이한나</td>
		</tr>
		<tr>
			<th>아이디</th>
			<td>LEE</td>
		</tr>
		<tr>
			<th>암 호</th>
			<td><input type="text" size="20"></td>
		</tr>
		<tr>	
			<th>전화번호</th>
			<td>010-9284-7821</td>
		</tr>
		
		<tr>
			<th>email</th>
			<td>ddddd@naver.com</td>
		</tr>
		<tr>
			<th>회원가입일</th>
			<td>2025.11</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>강동구 명일동</td>
		</tr>
	</table>
	<div align="center">
		<br><input type="submit" value="수정">
			<input type="reset" value="취소">
	</div>
	 <footer><p>COPYRICHT(C) 2025 과일농장, lnc. All Rights Reserved</p></footer>
</body>
</html>