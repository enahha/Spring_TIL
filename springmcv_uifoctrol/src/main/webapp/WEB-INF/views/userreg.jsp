<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="/springmcv_uifoctrol/userreg">
		<pre>
			아이디: <input type="text" name="id" />
			패스워드: <input type="text" name="password" />
			이름: <input type="text" name="name" />
			주소: <input type="text" name="address" />
			<input type="submit" value="회원가입" />
		</pre>
	</form>
</body>
</html>