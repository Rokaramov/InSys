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
<section>
<div class="container wrapper">
	<form class="biba" action="${pageContext.request.contextPath}/Writer" method="post">
		<H1 align="center">Здесь можно сменить процентную ставку</H1>
			<label for="first">Введите первую процентную ставку</label>
			<input class="input" name="firstAdmPercent" id="firstAdmPercent" value="10" required inputmode="decimal">
			<label>%</label>
			<br>
			<br>
			<br>
			<label for="third">Введите вторую процентную ставку</label>
			<input class="input" name="secondAdmPercent" id="secondAdmPercent" value="15" required inputmode="decimal">
			<label>%</label>
			<br>
			<br>
			<br>
			<label for="fourth">Введите третью процентную ставку</label>
			<input class="input" name="thirdAdmPercent" id="thirdAdmPercent" value="20" required inputmode="decimal">
			<label>%</label>
			<br>
			<br>
			<input class="input" type="submit" name="sign" value="Сменить">	
	</form>
	</div>
			</section>
			<script type="text/javascript">
			
			let reg = /[A-Za-zА-Яа-яЁё]/g;
			let regSymbols = /[^\d\.]/g;
			
			let firstAdmPercent = document.querySelector('#firstAdmPercent');
			
			firstAdmPercent.oninput = function(){
				this.value = this.value.replace(reg, '');
				this.value = this.value.replace(regSymbols, '');
				this.value = this.value.substr(0,5);
			}
			let secondAdmPercent = document.querySelector('#secondAdmPercent');
			
			secondAdmPercent.oninput = function(){
				this.value = this.value.replace(reg, '');
				this.value = this.value.replace(regSymbols, '');
				this.value = this.value.substr(0,5);
			}
			let thirdAdmPercent = document.querySelector('#thirdAdmPercent');
			
			thirdAdmPercent.oninput = function(){
				this.value = this.value.replace(reg, '');
				this.value = this.value.replace(regSymbols, '');
				this.value = this.value.substr(0,5);
			}
			</script>
</body>
</html>