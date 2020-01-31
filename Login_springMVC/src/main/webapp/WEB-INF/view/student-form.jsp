<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
.error{color: red}
</style>
<title>Fill form</title>
</head>
<body>
<h1 align="center"><u>Registration form</u></h1>
<form:form action="processLogin" modelAttribute="student" method="post">
First Name:<form:input path="firstname"></form:input>
<form:errors path="firstname" cssClass="error"> </form:errors>
<br>
<br>
Last Name:<form:input path="lastname"></form:input>
<form:errors path="lastname" cssClass="error"></form:errors>
<br>
<br>
Age:<form:input path="age"/>
<form:errors path="age" cssClass="error"></form:errors>
<br>
<br>
Email:<form:input path="email"/>
<form:errors path="email" cssClass="error"></form:errors>
<br>
<br>
Mobile:<form:input path="mobile"/>
<form:errors path="mobile" cssClass="error"></form:errors>
<br>
<br>
Country:
<form:select path="country">
<form:options items="${student.countries}"></form:options>
</form:select>
<br>
<br>
Language Prefered:
Java<form:radiobutton path="language" value="Java"></form:radiobutton>
C<form:radiobutton path="language" value="C"></form:radiobutton>
Python<form:radiobutton path="language" value="Python"></form:radiobutton>
Ruby<form:radiobutton path="language" value="Ruby"></form:radiobutton>
<br>
<br>
Operating System:
Linux <form:checkbox path="operatingSystems" value="Linux" />
Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
MS Windows <form:checkbox path="operatingSystems" value="MS Window" />
<br>
<br>
<input type="submit" value="Login" />
<input type="reset" value="Reset" />
</form:form>
</body>
</html>