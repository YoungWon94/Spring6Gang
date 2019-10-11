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
<h1>상품 목록</h1>
<table border="1" width="600px">
	<tr>
		<th>상품코드</th>
		<th>미리보기</th>
		<th>상풍명</th>
		<th>가격</th>
	</tr>
	<c:forEach var="row" items="${list}">
	<tr>
		<td>${row.product_id}</td>
		<td><img src="${path}/upload/${row.picture_url}" width="200" height="100"/></td>
		<td><a href="${path}/shop/product/view/${row.product_id}">${row.product_name}</a></td>
		<td>${row.price}</td>
	</tr>
	</c:forEach>
	
</table>
</body>
</html>