<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<h1>MAYOR</h1>
	

	<form method="post" action="mayor">
		
		Número 1:
		<input type="text" name="num1" /><br/>
		
		Número 2:
		<input type="text" name="num2" /><br/>
	
		Número 3:
		<input type="text" name="num3" /><br/>
		
		Número 4:
		<input type="text" name="num4" /><br/>	
	
		<input type="submit" value="mayor" />
		
	</form>
</body>
</html>
