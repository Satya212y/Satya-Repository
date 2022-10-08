<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead || Save</title>
</head>
<body>
<h2>Create One Lead</h2>
<form action="saveOneLead" method="post">
				<pre>
				First Name <input type="text" name="firstName" />
				 Last Name <input type="text" name="lastName" />
			 	     Email <input type="text" name="email" />
				    Mobile <input type="text" name="mobile" />
				Gender :
				           <input type="radio" name="gender" value="male"> Male<br>
				           <input type="radio" name="gender" value="female"> Female<br>
				Lead Source :<label for="source">Choose a source:</label>
				     <select  name="leadSource">
				  <option value="Radio">Radio</option>
				  <option value="Youtube">Youtube</option>
				  <option value="facebook">Facebook</option>
				  <option value="Tv">TV</option>
				</select>
				<input type="submit" value="save"/>
				</pre>
</form>

</body>
</html>