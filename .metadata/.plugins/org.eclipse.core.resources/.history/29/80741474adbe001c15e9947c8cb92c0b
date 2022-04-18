<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<hr>

<h3>일반 사용자 : 고객님.</h3>
<a href="community/list">우리동네 커뮤니티</a> <br>
<c:if test="${user!=null }"></c:if>		<!-- 로그인했을 때 메뉴 -->
<a href="logout">로그아웃</a>
<br>${user.name } 님 환영합니다.
<c:if test="${users==null } "></c:if>	<!-- 로그인 안했을때 메뉴 -->
<a href="login">고객님 로그인</a>

<h3>관리자</h3>
<!-- 관리자 메뉴 : 별도로 페이지를 만듭니다.(여기서는 테스트로 같은 화면에 ... -->
<c:if test="${admin!=null }"></c:if>	
<a href="logout">로그아웃</a>
<br>${admin.adminId } 님 환영합니다.
<c:if test="${admin==null }"></c:if>
<a href="admin">관리자 로그인</a>
</body>
</html>