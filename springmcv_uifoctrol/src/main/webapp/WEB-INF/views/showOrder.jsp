<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문결과페이지</title>
</head>
<body>
	<form action="/springmvc_uitoctrl/showOrderOther">
		<pre>
			주문상품: <input type="text" name="ordergoods" value="${order.ordergoods}" />
			수량: <input type="text" name="quantity" value="${order.quantity}" />
			<input type="submit" value="상품주문" />
		</pre>
	</form>
</body>
</html>