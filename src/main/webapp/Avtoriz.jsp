<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Авторизация</title>
</head>
<body>
          <form action="${pageContext.request.contextPath}/Glav.jsp" method="post">
			<input type="text" name="login" id="login" placeholder="Логин">
			<br>
			<br>
			<input type="password" name="psw" id="psw" placeholder="Пароль">
			<br>
			<br>
			<input type="submit" name="signin" value="Войти">
		  </form>
			<br>	
	       <form action="${pageContext.request.contextPath}/Registr.jsp" method="post">		
			<input type="submit" name="signup" value="Зарегистрироваться">
	        </form>
			<br>
</body>
</html>