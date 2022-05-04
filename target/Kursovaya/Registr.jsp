<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация</title>

<link rel="stylesheet" href="css/Beb.css">

</head>
<body>
 <h1>Регистрация</h1>
	<form action="${pageContext.request.contextPath}/Registration" method="post">
			<input type="text" name="loginReg" id="loginReg" placeholder="Логин" value="${loginReg}">
			<br>
			<br>
			<input type="password" name="passwordReg" id="passwordReg" placeholder="Пароль" value="${passwordReg}">
			<br>
			<br>
			<input type="radio" name="gender" value="user" checked />Обычный пользователь
    		<input type="radio" name="gender" value="admin" />Администратор
			<br>
			<br>
			<input type="submit" name="signup" value="Зарегистрироваться">
		  </form>
	<br>	
<form action="${pageContext.request.contextPath}/Avtoriz.jsp" method="post">		
<input type="submit" name="signup" value="Авторизация">
</form>
</body>
