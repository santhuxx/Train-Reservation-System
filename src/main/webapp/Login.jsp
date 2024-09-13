<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
    <link rel="stylesheet" type="text/css" href="CSSnew/login.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Login</title>
    
</head>

<body>
	 <div class="container">
      
		<div class="navbar"> 
		<img src="logo.png" class="logo1">
		<nav> 
			<ul> 
				<li><a href="home.jsp">Home</a></li>
            	<li><a href="aboutUs.jsp">About Us</a></li>
            	<li><a href="contactUs.jsp">Contact Us</a></li>
            	<li><a href="Login.jsp">Login</a></li>
            	<li><a href="userSignUp.jsp">Sign Up</a></li> 
			</ul>
		</nav>
    </div>
    </div>
    <div class="container1">
        <form action="login" method="post">
            <h2>Login</h2>
            <div class="input-container">
                <label for="username">User name:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="input-container">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>
    