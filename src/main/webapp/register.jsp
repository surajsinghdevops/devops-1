<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<html>
<head>
<title>Register</title>
</head>

<body>

<h2>User Registration</h2>

<form action="RegisterServlet" method="post">

Username:<br>
<input type="text" name="username"><br><br>

Email:<br>
<input type="text" name="email"><br><br>

Password:<br>
<input type="password" name="password"><br><br>

<input type="submit" value="Register">

</form>

</body>
</html>
