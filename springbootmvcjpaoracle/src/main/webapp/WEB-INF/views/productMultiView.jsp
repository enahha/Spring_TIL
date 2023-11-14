<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP JSPList</title>
	</head>
	<body>
		<table border="1">
			<tr>
				<th>번호</th>
				<th>상품아이디</th>
				<th>상품이름</th>
				<th>상품설명</th>
				<th>상품가격</th>
			</tr>
			<c:forEach var="product" items="${productlist}" varStatus="idx">
			<tr>
				<td>${idx.index + 1}</td>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
			</tr>
			</c:forEach>
		</table>
	
	</body>
	
</html>