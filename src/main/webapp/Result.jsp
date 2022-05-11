<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат</title>

<link rel="stylesheet" href="css/Beb.css">

</head>
<body>
<div class="container wrapper">
<p><strong>Результат вычислений</strong></p>
<br><br>
<p><strong>Сумма ежемесячного платежа составит:</strong> ${result}</p>
<br><br>
<p><strong>Введённые вами данные</strong></p>
<br><br>
<p><strong>Введённая сумма кредита:</strong> ${result2}</p>
<p><strong>Введённая процентная ставка:</strong> ${result3}</p>
<p><strong>Введённый срок кредитования:</strong> ${result4}</p>
<p><strong>Введённый первоначальный взнос:</strong> ${result5}</p>

<form class="biba"  action="${pageContext.request.contextPath}/Glav.jsp" method="post">
			<input class="input"  type="submit" name="sign" value="Назад">	
	</form>
	</div>
</body>
</html>