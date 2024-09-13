<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
    <link rel="stylesheet" type="text/css" href="CSSnew/signUp.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Sign Up</title>
    
</head>

<body>

	 <div class="container">
      
		<div class="navbar"> 
		<img src="logo.png" class="logo1">
		<nav> 
			<ul> 
				<li><a href="home.jsp">Home</a></li>
            	<li><a href="aboutus.jsp">About Us</a></li>
            	<li><a href="contactus.jsp">Contact Us</a></li>
            	<li><a href="Login.jsp">Login</a></li>
            	<li><a href="userSignUp.jsp">Sign Up</a></li> 
			</ul>
		</nav>
    </div>
    </div><br><br><br><br>
    
       <form action="userinsert" method="post">
		Name <br><input type="text" name="name"required><br>
		Email <br><input type="text" name="email"placeholder="abc@gmail.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}" required><br>
		Phone Number <input type="text" name="phone" placeholder="0777123456" pattern="[0-9]{10}" required><br>
		User Name <input type="text" name="uid"required><br>
		Password <input type="password" name="psw"required><br>
		
		<input type="submit" name="submit" value="Sign Up">
	</form>
    
       
    
</body>
</html>