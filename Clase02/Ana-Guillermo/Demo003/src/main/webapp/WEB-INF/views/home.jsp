<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	MAYOR </h1>
	<form method= "post" action="mayor">
	
	Numero 1:
	<input type="text" name= "num1" /><br/>
	
	Numero 2:
	<input type="text" name= "num2" /><br/>
	
	Numero 3:
	<input type="text" name= "num3" /><br/>

	Numero 4:
	<input type="text" name= "num4" /><br/>

	<input type="submit" value="Mayor" />
	
	</form>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
