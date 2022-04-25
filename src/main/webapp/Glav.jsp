<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ипотечный калькулятор</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/Calc" method="post">
		<H1>Добро пожаловать в ипотечный калькулятор!</H1>
		<H1>Введите все необходимые данные и нажмите "рассчитать"</H1>
			<label for="first">Введите стоимость недвижимости</label>
			<input type="text" name="first" id="first" value="${summa}">
			<label>Рублей</label>
			<br>
			<br>
			<br>
			<!--  <label for="second">Выберите процентную ставку</label>
			<input type="text" name="second" id="second" value="${percent}">
			<label>%</label>-->
			<label for="stavka">Выберите процентную ставку</label>
			<select name="stavka">
				<option value="stavka1">Процент%</option>
				<option value="stavka2">Процент%</option>
				<option value="stavka3">Процент%</option>
			</select>
			<!--  <label for="stavka">Процентная ставка</label>
			 <select name="stavka">
			 	<option value ="percent1">12%</option>
			 	 
			 
			 </select>-->
			<br>
			<br>
			<br>
			<label for="third">Введите срок кредитования</label>
			<input type="text" name="third" id="third" value="${srok}">
			<label>Полных лет</label>
			<br>
			<br>
			<br>
			<label for="forth">Введите ваш первоначальный взнос</label>
			<input type="text" name="forth" id="forth" value="${vznos}">
			<label>Рублей</label>
			<br>
			<br>
			<input type="submit" name="schet" value="Рассчитать">	
	</form>
	<br>
	<form action="${pageContext.request.contextPath}/Info.jsp" method="post">
			<input type="submit" name="infotmation" value="Информация">
	</form>
			<br>	
	<form action="${pageContext.request.contextPath}/Avtoriz.jsp" method="post">		
			<input type="submit" name="sign" value="Авторизация">
	</form>
	<br>
			<input type="submit" name="pdf" value="Создать PDF">	
</body>
</html>