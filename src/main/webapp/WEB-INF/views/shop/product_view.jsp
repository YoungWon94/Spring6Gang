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
<h1>상품 상세</h1>
<form action="${path}/shop/cart/insert.do" method="post">
<table border="1">
	<tr>		
		<td rowspan="5"><img src="${path}/upload/${dto.picture_url}"/></td>		
	</tr>
	<tr>
		<td style="font-weight: bold">상품명</td>
		<td>${dto.product_name}</td>
	</tr>
	<tr>
		<td style="font-weight: bold">가격</td>
		<td>${dto.price}</td>
	</tr>
	<tr>
		<td style="font-weight: bold">설명</td>
		<td>${dto.description}</td>
	</tr>
	<tr>
		<td colspan="2" align="right">
		<input type="hidden" name="product_id" value="${dto.product_id}"/>
		<select name="amount">
			<c:forEach begin="1" end="10" var="i">
				<option value="${i}">${i}</option>
			</c:forEach>
		</select>
		<input type="submit" value="장바구니 담기"/>
		</td>
	</tr>
</table>
</form>
</body>
</html>