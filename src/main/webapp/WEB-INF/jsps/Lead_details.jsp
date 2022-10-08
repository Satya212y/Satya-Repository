<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
       <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead || List</title>
</head>
<body>
<h2>Lead Result</h2>
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
				          <th>Convert</th>
				             <th>Update</th>
				         
				</tr>
				<c:forEach items="${leads}" var="lead">
				<tr>
				<td>${lead.id}</td>
				 <td><a href="getOneLeadInfo?id=${lead.id}">${lead.firstName}</a></td>
				   <td>${lead.lastName}</td>
				    <td>${lead.email}</td>
				      <td>${lead.mobile}</td>
				      <td>${lead.leadSource}</td>
				      <td>${lead.gender}</td>
				       <td><a href="deleteLead?id=${lead.id}">delete</a></td>
				        <td><a href="convert?id=${lead.id}">Convert</a></td>
				         <td><a href="UpdateLead?id=${lead.id}">Update</a></td>
				       
				    
				</tr>
				</c:forEach>
				

</table>


</body>
</html>