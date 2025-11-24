<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<div class="login-container">
	<h2>회원가입</h2>
	'*'표시 항목은 필수 입력 항목입니다.
	<form action="FruitServilet?command=fruit_login">
		<div class="input-group">
		<table>
			
			<tr>
				<td>이름</td>
				<td><input type="text" size="20">*</td>
			</tr>
			
			<tr>
				<td>아이디</td>
				<td><input type="text" size="20">*</td>
			</tr>
			<tr>
				<td>암 호</td>
				<td><input type="password" size="20">*</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" size="20">*</td>
			</tr>
		<tr>
				<td>email</td>
				<td><input type="text" size="20">*</td>
			</tr>
		
		</table>
		<div class="links">
			<input type="submit" value="확인">
			<input type="reset" value="취소">
		</div>	
		</div>
	</form>
	</div>
</body>
</html>