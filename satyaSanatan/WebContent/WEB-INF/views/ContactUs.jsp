<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Contact Us</title>

    <!-- Bootstrap -->
 
 <link rel="stylesheet" type="text/css" href="css/veda.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
   <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Raleway:100,600,400">
 
<style>
   
body{
transition: all 0.3s ease;
}
.row p {
    color: #fff;
}
.row h2{
color: #fff;
font-weight:700;
}
label.control-label.col-sm-2{
color:#fff;
font-weight: normal;
}

input.form-control{
background: transparent;
color:#fff;
}

textarea.form-control{
background: transparent;
color:#fff;
}

.row h4, p {
    color: #4e4a4a;
}

.navbar-default .navbar-nav > li > a{
	color:#fff;
	font-size:18px;
}

   </style>
 
  </head>
  
  <body style="font-family: 'Quicksand', sans-serif; background: url('img/geeta1.png'); background-repeat:no-repeat;background-size:cover; background-position:center;">
   
 <div id="header">
<nav class="navbar navbar-default">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     <a class="navbar-brand" href="home.html"><img class="img-responsive" src="img/adi-shankara-logo.png" width="47%"></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
     
       <ul class="nav navbar-nav navbar-right">
	      <li class="courselist_link"><a href="home">Home</a></li>
	      <li class="courselist_link"><a href="About_Us">About</a></li>
	      <li class="courselist_link"><a href="Contact_US">Contact Us</a></li>
	      <li class="courselist_link"><a href="Upload_document">Upload File</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>

<c:if test="${msge!=NULL}">
<h1 align="center" style="color:#fff;text-transform: capitalize;">${msge}</h1>
</c:if>

<div class="container">
	<div class="col-sm-12 col-md-12">
		<div class="ved-text">

	</div>
</div>
<div class="ved-category ved-text">
<div class="row">
<div class="col-sm-12 col-md-12">						
<div class="col-md-12 col-sm-6" style="box-shadow: 2px -6px 31px 4px grey; background:#2a2c2ea6;">
<form class="form-horizontal" action="getContactUsInfo">
<div class="form-group" align="center" style="margin:20px ">
			
    <h2>Contact Us</h2>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="name">Name:</label>
    <div class="col-sm-9">
      <input type="text" class="form-control" autocomplete="off" name="name" placeholder="Enter Name" required="required" >
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email:</label>
    <div class="col-sm-9"> 
      <input type="email" class="form-control" autocomplete="off" name="email" placeholder="Enter Email" required="required" >
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="mobile">Mobile No:</label>
    <div class="col-sm-9"> 
      <input type="mobile" class="form-control"  autocomplete="off" maxlength="10" minlength="10" name="phonenumber" placeholder="Enter Mobile No" required >
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="query">Query:</label>
    <div class="col-sm-9"> 
      <textarea type="email" rows="4" class="form-control" name="query" placeholder="Enter Your Query" required="required"></textarea>
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-9" align="center">
      <button type="submit" class="btn btn-info example2">Submit</button>
    </div>
  </div>
</form>
	
</div>
</div>
</div>
</div>
</div>

<div class="veda-footer">
<div class="container">
	<div class="footer">
		<p style="color:#fff">© Copyright 2018. All Rights Reserved.</p>
	</div>
</div>
</div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js" integrity="sha384-tsQFqpEReu7ZLhBV2VZlAu7zcOV+rXbYlF2cqB8txI/8aZajjp4Bqd+V6D5IgvKT" crossorigin="anonymous"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
     <script src="js/bootstrap.js"></script>
     <script src="js/jquery.preloaders.js"></script>
  
     
     <script>
        $(function(){

          

            // Advanced example
            $('.example2').click(function(){

                $.preloader.start({
                    modal: true,
                    src : 'img/sprites2.png'
                });

                setTimeout(function(){
                    $.preloader.stop();
                }, 3000);

            });

        });
    </script>
    
   

  </body>
</html>