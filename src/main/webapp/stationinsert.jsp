<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

    <link rel="stylesheet" type="text/css" href="css/inserttrain.css"/>
    
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Insert a Train</title>
    
<style>
    body {

     	background-image: url('backg.jpg'); 
        }
</style>
</head>
<body>

	 <div class="container">
      
		<div class="navbar"> 
		<img src="logo.png" class="logo1">
		<nav> 
			<ul> 
				<li><a href="adminpage.jsp">Home</a></li>
            <li><a href="aboutus.jsp">About Us</a></li>
            <li><a href="contactus.jsp">Contact Us</a></li>
            
				
			</ul>
		</nav>
    </div>
    </div>
    
    <br><br><br><br>
    
	<form action="insert" method="post">
		<h1>Station Form</h1><br><br>
		Station No<input type="text" name="stno" ><br><br>
		Station Name<input type="text" name="stname" ><br><br>
		District<input type="text"  name="district" required><br><br>
	    Phone No<input type="text" name="phone" placeholder="0789635415" pattern="[0-9]{10}" required><br><br>


	    <input type="submit" name="submit" value="Create Station">
	
	
	</form>


</body>
</html>