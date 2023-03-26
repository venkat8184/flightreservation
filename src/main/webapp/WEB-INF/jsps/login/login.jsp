<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${error}
<form action="verifyLogin" method="post">
Email:<input type="text" name="emailId"><br>
Password:<input type="password" name="password"><br>
<input type="submit" value="login">
</form>
</body>
</html>