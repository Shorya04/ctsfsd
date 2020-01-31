<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Student logged in Successfully!!
<br>
<br>
Student name: ${student.firstname} ${student.lastname}
<br>
Country: ${student.country}
<br>
Language Prefered: ${student.language}
<br>
Operating Systems:
<ul>
<c:forEach var="temp" items="${student.operatingSystems}"> 
<li>${temp}</li>
</c:forEach>
</ul>

</body>
</html>