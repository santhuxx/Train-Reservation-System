<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
    <link rel="stylesheet" type="text/css" href="CSSnew/signUp.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Insert a Train</title>
    
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
    <br><br><br>
       <form action="traininsert" method="post">
		Train name <input type="text" name="tname" required><br>
		Train Type <input type="text" name="ttype" required><br>
		Box Count <input type="text" name="tcount"required><br>
		Train Details <input type="text" name="tdetails"required><br>
		
		<input type="submit" name="submit" value="Insert train">
	</form>
    
       
    
</body>
</html>