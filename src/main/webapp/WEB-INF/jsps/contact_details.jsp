<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@include file="menu.jsp" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact || List</title>
</head>
<body>
<h2>Contact Result</h2>
<table>
				<tr>
				<th>ID</th>
				    <th>First Name</th>
				     <th>Last Name</th>
				      <th>Email</th>
				       <th>Mobile</th>
				        <th>Lead Source</th>
				         <th>Gender</th>
				         <th>Delete</th>
				          <th>Billing</th>
				         
				</tr>
				<c:forEach items="${leads}" var="contact">
				<tr>
				<td>${contact.id}</td>
				 <td><a href="getOneContactDetail?id=${contact.id}">${contact.firstName}</a></td>
				   <td>${contact.lastName}</td>
				    <td>${contact.email}</td>
				      <td>${contact.mobile}</td>
				      <td>${contact.leadSource}</td>
				      <td>${contact.gender}</td>
				       <td><a href="deleteContact?id=${contact.id}">delete</a></td>
				         <td><a href="BillinDetails?id=${contact.id}">Billing</a></td>
				      
				       
				    
				</tr>
				</c:forEach>
				

</table>


</body>
</html>