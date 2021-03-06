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
<h1> 장바구니 </h1>
<c:choose>
	<c:when test="${count == 0}">
	장바구니 비어있음.
	</c:when>
	<c:otherwise>
		<form name="form1" method="post" action="${path}/shop/cart/update.do">
			<table border="1" width="400px">
				<tr>
					<th>상품명</th>
					<th>단가</th>
					<th>수량</th>
					<th>금액</th>
					<th>&nbsp;</th>
				</tr>
				<c:forEach var="row" items="${list}">				
					<tr>
						<td>${row.product_name}</td>
						<td>${row.price }</td>
						<td><input type="number" name="amount" value="${row.amount}">
						<input type="hidden" name="product_id" value="${row.product_id}"></td>
						<td>${row.money }</td>
						<td><a href="${path}/shop/cart/delete/${row.cart_id}">삭제</a></td>
					</tr>
				</c:forEach>
				<tr>
				<td colspan="5" align="right">
					장바구니 금액 합계 : ${sumMoney}<br>
					배송료 : ${fee}<br>
					총합계 : ${sum}
				</td>
				</tr>
			</table>
			<button id="btnUpdate">수정</button>
		</form>
			<button type="button" id="btnDelete">장바구니 비우기</button>
			<button type="button" id="btnList">상품 목록</button>
	</c:otherwise>

</c:choose>


</body>
</html>