<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
</head>
<body>
 <header>
   		<nav>
        	<ul>
                <li><a href="FruitServilet?command=fruit_home">홈으로</a></li>
                <li><a href="FruitServilet?command=fruit_home">공지사항</a></li>
                <li><a href="FruitServilet?command=fruit_Control">회원관리</a></li>
                <li><a href="FruitServilet?command=fruit_Item">상품목록</a></li>           
            </ul>
        </nav>
	 <h1>상품 페이지</h1>
	 
   <table class="list">
      	<tr>
      		<td colspan="5" style ="border: white; text-align:left; font-size:25px ">
      		<b>상품목록</b></td>
      	</tr>
      	<tr>
      		<th>번호</th>	
      		<th>상품명</th>	
      		<th>가격</th>	
      		<th>원산지</th>
      		<th>수정</th>		
      		<th>삭제</th>				
     	 </tr>
     	 <c:forEach var="product" items="${productList}">
         <tr class="record">
            <td>${product.code}</td>
            <td>${product.name}</td>
            <td>${product.price} 원</td>
            <td>${product.origin}</td>
            <td><a href="FruitServilet?command=fruit_PDP&code=${product.code}">상품 수정</a> </td>
            <td><a href="productDelete.do?code=${product.code}">상품 삭제</a> </td>
            </tr>
         </c:forEach>
      		
      
      </table>
			
	</header>
		<footer><p>COPYRICHT(C) 2025 과일농장, lnc. All Rights Reserved</p></footer>
</body>
</html>