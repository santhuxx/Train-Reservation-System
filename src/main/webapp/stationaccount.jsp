<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>
    body {

     	background-image: url('backg.jpg'); 
     	background-size: cover;
        background-repeat: no-repeat;
        background-attachment: fixed; /* Keeps the background fixed when scrolling */
        font-family: 'Roboto', sans-serif;
        }
        
        @charset "ISO-8859-1";




        .container {
    background-color: #333;
    color: #fff;
    padding: 20px;
}

.navbar {
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.logo1 {
    width: 70px; /* Set the width of the logo to 30 pixels */
    height: auto; /* Allow the height to adjust proportionally */
    margin-right: 10px;
     /* Adjust the margin between the logo and navigation */
}

.navbar ul {
    list-style: none;
    margin: 0;
    padding: 0;
    display: flex;
}

.navbar li {
    margin-right: 20px;
}

.navbar a {
    text-decoration: none;
    color: #fff;
}

.text1{
	
	display: flex;
	height: 80%;
	align-items: center;
 	position: absolute;
 	top: 50%;
 	transform: translate(0, -50%);
	padding: 40px;
	
	
}

.col{
	flex-basis: 50%;
}

h1{
	color: #fff;
	font-size: 50px;
	text-shadow: 2px 2px 15px #baf707;
}

p{
	color: #fff; 
	font-size: 20px;
	line-height: 30px;
}

.navbar ul {
    list-style: none;
    margin-left: 270px;
}

.navbar ul li {
    display: inline;
    margin-right: 10px; /* Adjust the margin between menu items as needed */
}

.navbar a {
    text-decoration: none;
    color: #fff; /* Text color for links */
    font-weight: bold;
}

/* Add hover effect for links */
.navbar a:hover {
    color: #88273b; /* Color on hover */
}

nav ul li{
	list-style: none;
	display: inline-block;
	margin-left: 30px;
	
}

.navbar{
	height: 12%;
	display: flex;
	align-items: center;
}

button{

	width: 180px;
	color: #000;
	font-size: 12px;
	padding: 12px 0;
	background: #fff;
	border: 0;
	border-radius: 20px;
	outline: none;
	margin-top: 30px;

}

.card{

	width: 500px;
	height: 120px;
	display: inline-block;
	border-radius: 10px;
	padding: 15px 40px;
	box-sizing: border-box;
	cursor: pointer;
	margin: 10px 40px;

	background-position: center;
	background-size: cover;
	transition: transform 0.5s;
	
}

.card1{
	background-image: url(rent1.png) ;
	
}

.card2{
	background-image: url(fuel.png) ;
	
}

.card3{
	background-image: url(analytics.png) ;
	
}

h5{
	color: #fff;
	text-shadow: 2px 2px 15px #000000;
	font-size: 40px;
	font-family: Arial, Helvetica, sans-serif;
}

.card:hover{
	transform: translateY(-10px) ;
}

/* Style the table */
/* Style the table container */
.table-container {
    background-color: rgba(255, 255, 255, 0.9); /* Adjust the alpha (0.9) for transparency */
    padding: 20px;
    border-radius: 10px;
    margin: 0 auto; /* Center horizontally */
    max-width: 800px; /* Adjust the maximum width as needed */
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); /* Add a shadow for depth */
}


/* Style the table */
table {
    width: 50%; /* Adjust the width as needed */
    border-collapse: collapse;
    margin: 0 auto; /* Center the table horizontally */
    background-color: white; 
    border-radius: 5px;
     border-collapse: separate; 
    border-spacing: 10px;
}/* Transparent background for the table */


th, td {
  	
   	text-align: left;
    padding: 10px; /* Adjust this value for cell padding */
    border: 1px solid #000; 
}

th {
    background-color: #f2f2f2;
}

.button-container {
    text-align: center;
    margin-top: 20px; /* Adjust the margin as needed for spacing */
}

/* Style the buttons */
input[type="button"] {
    background-color: #4CAF50;
    color: white;
    border: none;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 14px;
    margin-right: 10px;
    cursor: pointer;
    border-radius: 5px;
}

input[type="button"]:hover {
    background-color: #45a049;
}
</style>

</head>

<body>


<div class="main">
	<h1 class="cus">***Station Details****</h1><br>
	
	<table>
	
	<tr>
					<th>No</th>
					<th>Station No</th>
		            <th>Station Name</th>
				    <th>District</th>
				    <th>Contact No </th>
				    <th></th>
				    <th></th>
	</tr> 
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="stno" value="${cus.stno}"/>
	<c:set var="stname" value="${cus.stname}"/>
	<c:set var="district" value="${cus.district}"/>
	<c:set var="phone" value="${cus.phone}"/>

	<tr>
							<td class="cs">${cus.id}</td>
							<td class="cs">${cus.stno}</td>
							<td class="cs">${cus.stname}</td>
							<td class="cs">${cus.district}</td>
							<td class="cs">${cus.phone}</td>
			
							<td>	
									<c:url value="updatestation.jsp" var="cusupdate">
										<c:param name="id" value="${id}"/>
										<c:param name="stno" value="${stno}"/>
										<c:param name="stname" value="${stname}"/>
										<c:param name="district" value="${district}"/>
										<c:param name="phone" value="${phone}"/>
								
									</c:url>
									
									<a href="${cusupdate}">
										<input type="button" name="update" value="Update Station" ><br>
									</a>
							</td>
							
							<td>
									<br>
									<c:url value="deletestation.jsp" var="cusupdate">
										<c:param name="id" value="${id}"/>
										<c:param name="stno" value="${stno}"/>
										<c:param name="stname" value="${stname}"/>
										<c:param name="district" value="${district}"/>
										<c:param name="phone" value="${phone}"/>
									</c:url>
									
									<a href="${cusupdate}">
										<input type="button" name="delete" value="Delete Station" ><br><br><br>
									</a>
							</td>
						</tr>
	
	</c:forEach>
	</table>

</div>

</body>
</html>



