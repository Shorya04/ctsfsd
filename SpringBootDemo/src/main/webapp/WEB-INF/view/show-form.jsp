<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
<form:form action="processform" modelAttribute="student" method="post">
 
  <div class="form-group">
    <label for="exampleInputEmail1">First Name:</label>
    <form:input path="firstName" ></form:input>
    </div>
    <br>
    <br>
    <div class="form-group">
    <label for="exampleInputEmail1">Last Name:</label>
    <form:input path="lastName" />
    </div>
    <br>
    <br>
     <div class="form-group">
    <label for="exampleInputEmail1">Email:</label>
    <form:input path="email" />
    </div>
    <br>
    <br>
<button type="submit" class="btn btn-primary">Submit</button>
</form:form>


</body>
</html>