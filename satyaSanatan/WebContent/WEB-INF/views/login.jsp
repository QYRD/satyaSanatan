<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%><html>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
   
<!DOCTYPE html>
<html lang="en">
 <head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">

body#LoginForm{ background-image:url("img/geeta1.png"); background-repeat:no-repeat; background-position:center; background-size:cover; padding:10px;}
</style>
</head>
<body id="LoginForm">
<!-- <div class="alert alert-warning alert-dismissible fade in" style="left:-70px; top:10px; position:relative;">
    	<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
 -->
<div class="container">

<div class="login-form">
<div class="main-div">
    
    
    <div class="panel">
     <c:if test="${errorMessage!=NULL}">
         <div style="background-color:powderblue;">
   		 <strong>Login Failure!!</strong><p>${errorMessage}</p>
 		</div>
     </c:if>	
   <h2>Admin Login</h2>
   <p>Please enter your email and password</p>
   </div>
    
    <form id="Login" action="loginPerson"  method="post">

        <div class="form-group">
            <input type="email" class="form-control" name="username" placeholder="Email Address">
        </div>

        <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Password">
        </div>

        <div class="forgot">
          <a href="#">Forgot password?</a>
        </div>
        
        <button type="submit" class="btn btn-primary">Login</button>

    </form>
    </div>
    
<p class="botto-text"></p>

</div>
</div>

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
     <script src="js/bootstrap.js"></script>

</body>
</html>