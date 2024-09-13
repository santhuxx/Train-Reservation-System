<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <link rel="stylesheet" type="text/css" href="CSSnew/deleteuser.css"/>
	<meta charset="UTF-8">
	<title>Delete Train</title>
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

	<%
		String tid = request.getParameter("tid");
		String tname = request.getParameter("tname");
		String ttype = request.getParameter("ttype");
		String tcount = request.getParameter("tcount");
		String tdetails = request.getParameter("tdetails");
		
	%>

	

	<div class="container1">
	<form action="deletetrain" method="post">
	<table>
		<tr>
			<td>Train ID</td>
			<td><input type="text" name="tid" value="<%= tid %>" readonly></td>
		</tr>
		<tr>
			<td>Train Name</td>
			<td><input type="text" name="tname" value="<%= tname %>" readonly></td>
		</tr>
		<tr>
		<td>Train Type</td>
		<td><input type="text" name="ttype" value="<%= ttype %>" readonly></td>
	</tr>
	<tr>
		<td>Box Count</td>
		<td><input type="text" name="tcount" value="<%= tcount %>" readonly></td>
	</tr>
	<tr>
		<td>Train Details</td>
		<td><input type="text" name="tdetails" value="<%= tdetails %>" readonly></td>
	</tr>		
	</table>
	<br>
	<input type="submit" name="submit" value="Delete Train">
	</form>
	</div>

</body>
</html>