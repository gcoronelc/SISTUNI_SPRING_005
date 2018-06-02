<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<h1>SUMA</h1>
	
	<form method="post" action="sumar">
		
		Número 1:
		<input type="text" name="num1" /><br/>
		
		Número 2:
		<input type="text" name="num2" /><br/>
	
		<input type="submit" value="Sumar" />
		
	</form>


</body>
</html>
