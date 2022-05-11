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
<div class="container wrapper">
 <h1>Регистрация</h1>
	<form class="biba" action="${pageContext.request.contextPath}/Registration" method="post">
			<input class="input" type="text" name="loginReg" id="loginReg" placeholder="Логин" value="${loginReg}" required>
			<br>
			<br>
			<input class="input"  type="password" name="passwordReg" id="passwordReg" placeholder="Пароль" value="${passwordReg}" required>
			<br>
			<br>
			<input class="radio" class="input"  type="radio" name="gender" value="user" checked />Пользователь
			<br>
			<br>
    		<input class="radio"  type="radio" name="gender" value="admin" />Администратор
			<br>
			<br>
			<input class="input"  type="submit" name="signup" value="Зарегистрироваться">
		  </form>
	
	<br>
<form class="biba" action="${pageContext.request.contextPath}/Avtoriz.jsp" method="post">		
<input class="input"  type="submit" name="signup" value="Авторизация">
</form>
<br>
	</div>	
	<br>
</body>