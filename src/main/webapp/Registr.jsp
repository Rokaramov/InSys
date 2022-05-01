<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация</title>

<link rel="stylesheet" href="css/NewFile.css">

</head>
<body>
<form action="${pageContext.request.contextPath}/Avtoriz.jsp" method="post">
			<input type="text" name="login" id="login" placeholder="Логин">
			<br>
			<br>
			<input type="password" name="psw" id="psw" placeholder="Пароль">
			<br>
			<br>
			<label>
			<input type="checkbox" name=" " value="admin">Как администратор
			</label>
			<br>
			<br>
			<input type="submit" name="signup" value="Зарегистрироваться">
		  </form>
			<br>	
	       <form action="${pageContext.request.contextPath}/Avtoriz.jsp" method="post">		
			<input type="submit" name="signup" value="Авторизация">
	        </form>
</body>
</html>