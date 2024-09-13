<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

    <link rel="stylesheet" type="text/css" href="css/inserttrain.css"/>
    
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">

<style>
    body {

     	background-image: url('backg.jpg'); 
        }
</style>

</head>
<body>


	<%
		String id = request.getParameter("id");
		String stno = request.getParameter("stno");
		String stname = request.getParameter("stname");
		String district = request.getParameter("district");
		String phone = request.getParameter("phone");

			
	%>
	
	<form action="update" method="post">
	<h1>Station Update</h1><br><br>
	
		 No<input type="text" name="cusid" value="<%= id%>" readonly><br><br>
		Station No<input type="text" name="stno" value="<%= stno%>"><br><br>
		Station Name<input type="text" name="stname" value="<%= stname%>"><br><br>
		District<input type="text" name="district" value="<%= district%>"><br><br>
	    Phone No<input type="text" name="phone" value="<%= phone%>"><br><br>

	    
	    <input type="submit" name="submit" value="Upadate Station">
	
	
	</form>



</body>
</html>