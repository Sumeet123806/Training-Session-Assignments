<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html  >
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class="form_action">
<form  action="adduser" method="post" enctype="multipart/form-data" accept="image/png, image/jpeg">


<label >First Name:</label>
<input type="text" name="first_name"><br><br>
<label >Last Name:</label>
<input type="text" name="Last_name"><br><br>
<label >Phone_No:</label>
<input type="text" name="phon_no"><br><br>
<label >Email:</label>
<input type="text" name="email"><br><br>
<input type="file" name="file" required>
<input type="submit">

</form>
</div>


</body>
</html>