<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<div style="text-align: center;">
	<a href="${path}/">Home</a>
	<a href="${path}/shop/product/list.do">상품목록</a>
	<c:if test="${sessionScope.userid == null }">
		<a href="${path}/member/login.do">로그인</a>		
	</c:if>
	<c:if test="${sessionScope.userid != null }">
		<a href="${path}/member/logout.do">로그아웃</a>
		<a href="${path}/shop/cart/list.do">장바구니(${count})</a>	
	</c:if>
	
	
	
		
</div>
<hr/>