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
<section>
<div class="container wrapper">
 <h1>Авторизация</h1>
          <form class="biba" action="${pageContext.request.contextPath}/Avtor" method="post">
			<input class="input" type="text" name="log" id="log" placeholder="Логин" value="${log}" required>
			<br>
			<br>
			<input class="input"  type="password" name="pass" id="pass" placeholder="Пароль" value="${pass}" required>
			<br>
			<br>
			<input class="input" type="submit" name="signin" value="Войти">
		  </form>
			
			<br>
	       <form class="biba" action="${pageContext.request.contextPath}/Registr.jsp" method="post">		
			<input class="input"  type="submit" name="signup" value="Регистрация">
	        </form>
			<br>
			</div>
			</section>
			<script type="text/javascript">
			
			let reg = /[А-Яа-яЁё]/g;
			
			let log = document.querySelector('#log');
			
			log.oninput = function(){
				this.value = this.value.replace(reg, '');
				this.value = this.value.substr(0,20);
			}
			let pass = document.querySelector('#pass');
			
			pass.oninput = function(){
				this.value = this.value.replace(reg, '');
				this.value = this.value.substr(0,20);
			}			
			</script>
</body>
</html>
