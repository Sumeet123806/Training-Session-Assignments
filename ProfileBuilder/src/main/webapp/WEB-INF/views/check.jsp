<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

        <p> Here are your details</p>
        <br>
        <p> First Name: ${Userinfo.first_name }</p>
        <br>
        <p>Last Name: ${Userinfo.last_name}</p>
        <br>
        <p>Phone Number: ${Userinfo.phon_no } </p>
        <br>
        <p>Email: ${Userinfo.email }</p>
        <br>
        <img  class="img-responsive" src="data:image/jpg;base64, ${filename}"  style="width:128px;height:128px;"/>                            
       

    </body>

</body>
</html>