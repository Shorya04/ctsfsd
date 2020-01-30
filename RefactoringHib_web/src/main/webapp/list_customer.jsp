<%@page import="comm.model.Customer"%>
<%@page import="java.util.List"%>
<%@page import="comm.service.CustomerServiceImpl"%>
<%@page import="comm.service.CustomerService"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	

	<link type="text/css"
		  rel="stylesheet"
		  href="style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2> Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add customer"
				   onclick="window.location.href='customerform.jsp'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			
<table class="table table-striped table-dark">
   <thead>
      <tr>
      <th scope="col">id</th>
      <th scope="col">FirstName</th>
      <th scope="col">LastName</th>
      <th scope="col">Email</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
				
				<!-- loop over and print our customers -->
<c:forEach var="tempCustomer" items="${customers}">
<c:url var="updateUrl" value="updateCustomer.do">

					
					<c:param name="id" value="${tempCustomer.id}"/>
					</c:url>
					<c:url var="deleteUrl" value="deleteCustomer.do">
					<c:param name="id" value="${tempCustomer.id}"/>
					</c:url>
 <tbody>
    <tr>
     
      <td>${tempCustomer.id }</td>
      <td>${tempCustomer.firstname}</td>
      <td>${tempCustomer.lastname}</td>
      <td>${tempCustomer.email}</td>
      <td><a href="${ updateUrl}">Update</a><a href="${ deleteUrl}">Delete</a></td>
    </tr>
</c:forEach>
	</tbody>
	</table>
	</div>
	</div>
</body>
</html>