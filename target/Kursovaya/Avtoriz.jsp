<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Авторизация</title>

<link rel="stylesheet" href="css/Beb.css">

</head>
<body>
 <h1>Авторизация</h1>
          <form action="${pageContext.request.contextPath}/Avtor" method="post">
			<input type="text" name="log" id="log" placeholder="Логин" value="${log}">
			<br>
			<br>
			<input type="password" name="pass" id="pass" placeholder="Пароль" value="${pass}">
			<br>
			<br>
			<input type="submit" name="signin" value="Войти">
		  </form>
			<br>	
			
	       <form action="${pageContext.request.contextPath}/Registr.jsp" method="post">		
			<input type="submit" name="signup" value="Регистрация">
	        </form>
			<br>
</body>
</html>