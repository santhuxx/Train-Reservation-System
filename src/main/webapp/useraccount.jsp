<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSSnew/useraccount.css"/>
<meta charset="ISO-8859-1">
<title>User Account</title>

	<style type="text/css">
		body{
			font-family: Hind SemiBold;
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
				<li><a href="home.jsp">Home</a></li>
            <li><a href="contactus.jsp">Contact Us</a></li>
            <li><a href="aboutus.jsp">About Us</a></li>
           
			</ul>
		</nav>
    </div>
    </div>
    <br>
	<br>
	<br><br>
	<br>
	<br>

	<div class="container1">
	<table>
	<c:forEach var="user" items="${userDetails}">
	
	<c:set var="id" value="${user.id}"/>
	<c:set var="name" value="${user.name}"/>
	<c:set var="email" value="${user.email}"/>
	<c:set var="phone" value="${user.phone}"/>
	<c:set var="username" value="${user.username}"/>
	<c:set var="password" value="${user.password}"/>
	
	<tr>
		<td>User ID</td>
		<td>${user.id}</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td>${user.name}</td>
	</tr>
	<tr>
		<td>User Email</td>
		<td>${user.email}</td>
	</tr>
	<tr>
		<td>User Phone</td>
		<td>${user.phone}</td>
	</tr>
	<tr>
		<td>User User Name</td>
		<td>${user.username}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="userupdate.jsp" var="cusupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	</div>
	
	<div class="button-container">
	<a href="${cusupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	

	<c:url value="userdelete.jsp" var="cusdelete">
		<c:param name="id" value="${id}" />
		<c:param name="name" value="${name}" />
		<c:param name="email" value="${email}" />
		<c:param name="uname" value="${username}" />
		<c:param name="pass" value="${password}" />
	</c:url>
	<a href="${cusdelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	</div>
	
	
</body>
</html>