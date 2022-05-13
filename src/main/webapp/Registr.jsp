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
<section>
<div class="container wrapper">
 <h1>Регистрация</h1>
	<form class="biba" action="${pageContext.request.contextPath}/Registration" method="post">
			<input class="input" type="text" name="loginReg" id="loginReg" placeholder="Логин" value="${loginReg}" required>
			<br>
			<br>
			<input class="input"  type="password" name="passwordReg" id="passwordReg" placeholder="Пароль" value="${passwordReg}" required>
			<br>
			<br>
			<input class="radio" class="input"  type="radio" name="gender" value="user" checked />Обычный пользователь
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
	</section>
			<script type="text/javascript">
			
			let reg = /[А-Яа-яЁё]/g;
			
			let loginReg = document.querySelector('#loginReg');
			
			loginReg.oninput = function(){
				this.value = this.value.replace(reg, '');
				this.value = this.value.substr(0,20);
			}
			let passwordReg = document.querySelector('#passwordReg');
			
			passwordReg.oninput = function(){
				this.value = this.value.replace(reg, '');
				this.value = this.value.substr(0,20);
			}			
			</script>
</body>
</html>