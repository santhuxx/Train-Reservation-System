<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
     <link rel="stylesheet" type="text/css" href="CSSnew/login.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>View Train account</title>
</head>
<body>
	 <div class="container">
      
		<div class="navbar"> 
		<img src="logo.png" class="logo1">
		<nav> 
			<ul> 
				<li><a href="adminpage.jsp">Home</a></li>

				
			</ul>
		</nav>
    </div>
    </div>
    <div class="container1">
        <form action="trainaccount" method="post">
            <div class="input-container">
                <label for="trainname">Train name:</label>
                <input type="text" id="trainname" name="trainname" required>
            </div>
            <button type="submit">View</button>
        </form>
    </div>
</body>
</html>