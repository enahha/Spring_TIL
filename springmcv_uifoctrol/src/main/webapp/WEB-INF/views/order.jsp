<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문페이지</title>
</head>
<body>
	<form action="/springmcv_uifoctrol/showOrder">
		<pre>
			주문상품: <input type="text" name="ordergoods" required="required"/>
			수량: <input type="text" name="quantity" required="required"/>
			<input type="submit" value="상품주문" />
		</pre>
	</form>
</body>
</html>