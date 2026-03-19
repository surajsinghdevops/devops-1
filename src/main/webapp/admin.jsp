<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<html>
<head>
<title>Admin Panel</title>
</head>

<body>

<h2>Add New Book</h2>

<form action="AddBookServlet" method="post">

Book Name:<br>
<input type="text" name="name"><br><br>

Author:<br>
<input type="text" name="author"><br><br>

Price:<br>
<input type="text" name="price"><br><br>

Quantity:<br>
<input type="text" name="quantity"><br><br>

<input type="submit" value="Add Book">

</form>

</body>
</html>
