<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	IDENTIFICAR NUMERO MAYOR
</h1>

 <form method="post" action="mayor">
 
 Primer Número:
 <input type="text" name="n1" /><br></br/>
 Segundo Número:
 <input type="text" name="n2" /><br><br></br/>
 Tercer Número:
 <input type="text" name="n3" /><br><br></br/>
 Cuarto Número:
 <input type="text" name="n4" /><br><br></br/>
 
 <input type="submit" value="Mayor" />
 
 </form>
</body>
</html>
