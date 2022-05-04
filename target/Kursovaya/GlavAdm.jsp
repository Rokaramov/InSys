<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Администрирование</title>

<link rel="stylesheet" href="css/Glav.css">
</head>
<body>
	<form action="${pageContext.request.contextPath}/Writer" method="post">
		<H1 align="center">Здесь можно сменить процентную ставку</H1>
			<label for="first">Введите первую процентную ставку</label>
			<input type="number" name="firstAdmPercent" id="firstAdmPercent" value="10">
			<label>%</label>
			<br>
			<br>
			<br>
			<label for="third">Введите вторую процентную ставку</label>
			<input type="number" name="secondAdmPercent" id="secondAdmPercent" value="15">
			<label>%</label>
			<br>
			<br>
			<br>
			<label for="fourth">Введите третью процентную ставку</label>
			<input type="number" name="thirdAdmPercent" id="thirdAdmPercent" value="20">
			<label>%</label>
			<br>
			<input type="submit" name="sign" value="Сменить">	
	</form>
</body>
</html>