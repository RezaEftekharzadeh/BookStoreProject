<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:directive.include file="header.jsp" />
	
	<div align="center">
	<form>
	<br><br><br>
		User Name :<input type="text" size=10 /> 
		<br><br>
		Password  :<input type="text"size=10 />
		<br><br>
		<input type="submit" value="login">
		
	</form>
	</div>

		<jsp:directive.include file="footer.jsp" />

</body>
</html>