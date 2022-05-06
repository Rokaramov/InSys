<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ипотечный калькулятор</title>

<link rel="stylesheet" href="css/Glav.css">

</head>
<body>
	<form action="${pageContext.request.contextPath}/Calc" method="post">
		<H1 align="center">Добро пожаловать в ипотечный калькулятор!</H1>
		<H1 align="center">Введите все необходимые данные и нажмите "рассчитать"</H1>
			<label for="first">Введите стоимость недвижимости</label>
			<input type="number" name="first" id="first" value="${first}">
			<label>Рублей</label>
			<br>
			<br>
			<br>
			<label for="second">Выберите процентную ставку</label>
			<select id="second" name="second">
				<option value="${firstGlavPercent}">${firstGlavPercent}</option>
				<option value="${secondGlavPercent}">${secondGlavPercent}</option>
				<option value="${thirdGlavPercent}">${thirdGlavPercent}</option>
			</select>
			<label>%</label>
			<br>
			<br>
			<br>
			<label for="third">Введите срок кредитования</label>
			<input type="number" name="third" id="third" value="${third}">
			<label>Полных лет</label>
			<br>
			<br>
			<br>
			<label for="fourth">Введите ваш первоначальный взнос</label>
			<input type="number" name="fourth" id="fourth" value="${fourth}">
			<label>Рублей</label>
			<br>
			<br>
		    <br>
			<label><strong>Сумма ежемесячного платежа составит:</strong> ${result}</label> <label> Рублей</label>
			<br>
			<br>
			<label><strong>Состояние PDF-файла:</strong> ${gotovo}</label> 
			<br>
			<input type="submit" name="sign" value="Рассчитать">	
	</form>
	<br>
	<form action="${pageContext.request.contextPath}/Info.jsp" method="post">
			<input type="submit" name="sign" value="Информация">
	</form>
			<br>	
	<form action="${pageContext.request.contextPath}/Avtoriz.jsp" method="post">		
			<input type="submit" name="sign" value="Авторизация">
	</form>
	<br>	
	<br>
	<a href="/Kursovaya/Team10.pdf"> Открыть PDF-файл</a>
</body>
</html>