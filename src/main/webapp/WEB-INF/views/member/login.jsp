<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/resources/include/menu.jsp" %>
<h1>로그인</h1>
<form action="${path}/member/login_check.do" method="post">
	아이디 : <input name="userid"/><br>
	비번 : <input type="password" name="passwd"/>
	<br><br>
	<input type="submit" value="로그인"/><br>
	${message}
</form>
</body>
</html>