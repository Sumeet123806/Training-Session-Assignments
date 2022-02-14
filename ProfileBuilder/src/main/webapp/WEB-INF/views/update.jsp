<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateimage" method="post" enctype="multipart/form-data" accept="image/png, image/jpeg">
<label >ID:</label>
<input type="number" name="id"><br><br>
<input type="file" name="file" required>
<input type="submit">


</form>

</body>
</html>