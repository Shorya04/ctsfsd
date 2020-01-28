<%@page import="comm.model.CustomerDto"%>
<%@page import="mapper.CustomerMapper"%>
<%@page import="comm.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Customers</title>
</head>
<body>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">UID</th>
      <th scope="col">Firstname</th>
      <th scope="col">Lastname</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
 <%  
 
 List<Customer> list=(List<Customer>)request.getAttribute("SUCCESS");
 CustomerMapper impl=new CustomerMapper();
 for(Customer c:list){
	 CustomerDto dto=impl.custertoCustomerDtoCustomer(c); %>
	 
	 <tbody>
	    <tr>
	      <td><%out.println(dto.getUId());%></td>
	      <td><%out.println(dto.getFirstname()); %></td>
	      <td><%out.println(dto.getLastname()); %></td>
	      <td><%out.println(dto.getEmail()); %></td>
	     </tr>
	 
	  </tbody>
	<%}%>


</body>
</html>
