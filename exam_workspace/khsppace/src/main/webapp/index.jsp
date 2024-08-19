<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>사원 정보 조회 (사원 번호 검색)</h1>                                                                      %EA%B7%B8%EB%A6%BC10.png

<form action ="">

<input type="text" placeholder="사원 번호 입력">

<input type="submit" value="조회">

</form>

<a herf ="/webapp/views/search.jsp" -> <!--조회 성공 시 나올 페이지--> 


<h1>사원 정보</h1>

<ul>

<li>사원 번호 : <%empId%></li>

<li>사원 이름 : <%empName%></li>

<li>사원 이메일 : <%email%></li>

<li>사원 전화번호 : <%phone%></li>

</ul>

<a href="/">메인 페이지로 돌아가기</a>

/webapp/views/fail.jsp -> 조회 실패 시 나올 페이지

<h1>조회 결과가 없습니다.</h1>

<a href="/">메인 페이지로 돌아가기</a>
</body>
</html>