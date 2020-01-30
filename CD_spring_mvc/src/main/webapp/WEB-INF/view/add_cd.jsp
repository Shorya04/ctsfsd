<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
<h2 align="center"><u>CD Details</u></h2>
<form action="processform" method="post">
  <div class="form-group">
    <label for="exampleFormControlInput1">CD Title</label>
    <input type="text" class="form-control" name="title">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">CD Type</label>
    <select class="form-control" id="exampleFormControlSelect1" name="type">
      <option>International</option>
      <option>Regular</option>
      <option>Special Edition</option>
     </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Year</label>
    <input type="text" class="form-control" name="year">
  </div>
 
 <input type="submit"/> 
 <input type="reset"/>
  </form>
</body>
</html>