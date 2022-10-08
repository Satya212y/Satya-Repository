<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@include file="menu.jsp" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing || List</title>
</head>
<body>
<h2>Billing Result</h2>
<table>
				<tr>
				<th>ID</th>
				    <th>First Name</th>
				     <th>Last Name</th>
				      <th>Email</th>
				       <th>Mobile</th>
				        <th>Product Name</th>
				         <th>Amount</th>
				         <th>Delete</th>
				          
				         
				</tr>
				<c:forEach items="${Bill}" var="bill">
				<tr>
				<td>${bill.id}</td>
				 <td><a href="billinfo?id=${bill.id}">${bill.firstName}</a></td>
				   <td>${bill.lastName}</td>
				    <td>${bill.email}</td>
				      <td>${bill.mobile}</td>
				      <td>${bill.product}</td>
				      <td>${bill.amount}</td>
				       <td><a href="delete?id=${bill.id}">delete</a></td>
				         
				      
				       
				    
				</tr>
				</c:forEach>
				

</table>


</body>
</html>