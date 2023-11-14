<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uitest01</title>
</head>
<body>
	<h1>tretrewrewrewre테스트세트스테흐</h1>
	<%
	/* HelloController.java에서 addobj로 추가한거 읽어 오는 거 */
		String id = (String)request.getAttribute("id");
		String passwd = (String)request.getAttribute("passwd");	
		Integer salary = (Integer)request.getAttribute("salary");
		out.println("id : " +id + "pass : " + passwd + "salary : " +salary);
	%>
	
</body>
</html>