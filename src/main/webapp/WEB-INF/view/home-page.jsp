<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function validation() {

		var username = document.getElementById('yn').value;
		var crushname = document.getElementById('cn').value;

		if (username < 2) {
			alert("Please enter username valid username more than two characters");
		}
		if (crushname < 2) {
			alert("Please enter username valid crsuhname more than two characters");
		}

	}
</script>

</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfoDTO">
		<!--  onsubmit="return validation()" -->
		<div align="center">
			<p>
				<label for="yn">Your Name :</label>
				<form:input type="text" id="yn" name="ownname" path="ownname" />
				<form:errors path="ownname" />
			</p>
			<p>
				<label for="cn">Crush Name :</label>
				<form:input type="text" id="cn" name="crushname" path="crushname" />
			</p>
			<input type="submit" name="Calculator" />
		</div>
	</form:form>
</body>
</html>