<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
</head>
<body marginwidth="5%" marginheight="2%">
  <h1>Customer Register Form</h1>
  <form action="register" method="post">
	   <table style="with: 80%">
		    <tr>
		     <td>Name</td>
		     <td><input type="text" name="Name" /></td>
		    </tr>
		    <tr>
		     <td>Email</td>
		     <td><input type="text" name="email" /></td>
		    </tr>
		    <tr>
		     <td>Phone No.</td>
		     <td><input type="text" name="phnno" /></td>
		    </tr>
		    <tr>
		     <td>Password</td>
		     <td><input type="password" name="password" /></td>
		    </tr>
		    <tr>
		     <td><input type="submit" value="Register" /></td>
		    </tr>
	   </table>
	   
  </form>
</body>
</html>