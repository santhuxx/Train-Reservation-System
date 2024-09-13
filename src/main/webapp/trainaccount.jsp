 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSSnew/useraccount.css"/>
<meta charset="ISO-8859-1">
<title>Train Account</title>

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
				<li><a href="adminpage.jsp">Home</a></li>
            
           
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
	<c:forEach var="train" items="${trainDetails}">
	
	<c:set var="tid" value="${train.tid}"/>
	<c:set var="tname" value="${train.tname}"/>
	<c:set var="ttype" value="${train.ttype}"/>
	<c:set var="tcount" value="${train.tcount}"/>
	<c:set var="tdetails" value="${train.tdetails}"/>
	
	
	<tr>
		<td>Train ID</td>
		<td>${train.tid}</td>
	</tr>
	<tr>
		<td>Train Name</td>
		<td>${train.tname}</td>
	</tr>
	<tr>
		<td>Train Type</td>
		<td>${train.ttype}</td>
	</tr>
	<tr>
		<td>Box Count</td>
		<td>${train.tcount}</td>
	</tr>
	<tr>
		<td>Train Details</td>
		<td>${train.tdetails}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="trainupdate.jsp" var="trainupdate">
		<c:param name="tid" value="${tid}"/>
		<c:param name="tname" value="${tname}"/>
		<c:param name="ttype" value="${ttype}"/>
		<c:param name="tcount" value="${tcount}"/>
		<c:param name="tdetails" value="${tdetails}"/>
	</c:url>
	
	</div>
	
	<div class="button-container">
	<a href="${trainupdate}">
	<input type="button" name="update" value="Update Train Data">
	</a>
	

	<c:url value="traindelete.jsp" var="traindelete">
		<c:param name="tid" value="${tid}" />
		<c:param name="tname" value="${tname}" />
		<c:param name="ttype" value="${ttype}" />
		<c:param name="tcount" value="${tcount}" />
		<c:param name="tdetails" value="${tdetails}" />
	</c:url>
	<a href="${traindelete}">
	<input type="button" name="delete" value="Delete train Account">
	</a>
	</div>
	
	
</body>
</html>