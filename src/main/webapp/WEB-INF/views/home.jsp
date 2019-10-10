<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<!-- 파일업로드 양식. post에 enctype="multipart/form-data 이어야 함. -->
<form method="post" action="upload" enctype="multipart/form-data">
	이름 : <input name="name"/><br>
	파일 : <input type="file" name="file1"><br>
	<input type="submit" value="업로드">
	
</form>

</body>
</html>
