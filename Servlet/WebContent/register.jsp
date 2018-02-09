<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
</head>
<body>

	<form action="${pageContex.request.cotexPath}/register"method="post">
		First Name:<input type="text" name="firstName"><br />
		Last Name:<input type="text" name="lastName"><br />
		<input tupe="submit" value="Send to server">
	</form>

</body>
</html>