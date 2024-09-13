<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="CSSnew/userupdate.css"/>
	<meta charset="UTF-8">
	<title>Update Train</title>
	<style type="text/css">
		table {
  			border-collapse: collapse;
		}

		table, th, td {
		  border: 1px solid black;
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
	<form action="trainUpdate" method="post">
	<table>
		<tr>
			<td>Train ID</td>
			<td><input type="text" name="tid" value="<%= tid %>" readonly></td>
		</tr>
		<tr>
			<td>Train Name</td>
			<td><input type="text" name="tname" value="<%= tname %>"></td>
		</tr>
		<tr>
		<td>Train Type</td>
		<td><input type="text" name="ttype" value="<%= ttype %>"></td>
	</tr>
	<tr>
		<td>Box Count</td>
		<td><input type="text" name="tcount" value="<%= tcount %>"></td>
	</tr>
	<tr>
		<td>Train Details</td>
		<td><input type="text" name="tdetails" value="<%= tdetails %>"></td>
	</tr>
			
	</table>
	<br>
	<input type="submit" name="submit" value="Update">
	</form>
	</div>

</body>
</html>