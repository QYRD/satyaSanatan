<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>About Us</title>

    <!-- Bootstrap -->
 <link rel="stylesheet" type="text/css" href="css/veda.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
   
  </head>
  <body  style="font-family: 'Quicksand', sans-serif;">
   
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

<div class="about-section">
	<div class="container">
    <div class="col-sm-12 col-md-12">
		<div class="veda-about">
			<h1><b>ABOUT US</b></h1>
		</div>
		<div class="veda-abpage">
			<p>A Team of individual software developers who want to develop a platform to boost interest of this generation towards spirituality. The purpose is to create repository of Indian Texts and serve as a one stop shop of</p>
			
      <ul class="veda-list">
        <li>Vedas (RigVeda, YajurVeda, SamVeda, AtharvaVeda)</li>
        <li>Upanishad (Ishopanishad, Kathopanishad, Kenopanishad, Chhandogya Upanishad, Svetasvara Upanishad)</li>
        <li>Itihas (Valmiki Ramayan, Mahabharata)</li>
        <li>Miscellaneous (other than above mentioned)</li>
      </ul>
      <p>The original texts are in Sanskrit and you also have the option to browse through Hindi / English commentaries of the same.</p>
      <p>Dynamic Fonts will be used to simplify the work. Hence, we don’t ask anyone to download the font.</p>
      <p> The interface is application and web – based.</p>
		</div>

  </div>
	</div>
</div>

<div class="developer-area">
  <div class="container">
    <div class="col-md-12 col-sm-12">
      <h1>List of application developers</h1>
    <div class="col-md-4 col-sm-12">
      <div class="card">
        <div class="box">
          <div class="img">
            <img src="img/abhiteshmishra.png">
          </div>
            <h2>Mr. Abhitesh Mishra<br><span>Application Developer</span></h2>
            <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
        </div>
      </div>
    </div>
    <div class="col-md-4 col-sm-12">
      <div class="card">
        <div class="box">
          <div class="img">
            <img src="img/sakshammishra.jpg">
          </div>
            <h2>Mr. Saksham Mishra<br><span>Web Graphic Designer</span></h2>
            <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
        </div>
      </div>
    </div>
    <div class="col-md-4 col-sm-12">
      <div class="card">
        <div class="box">
          <div class="img">
            <img src="img/abhiteshmishra.png">
          </div>
            <h2>Mr. Pradeep Chauhan<br><span>Back End Developer</span></h2>
            <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
        </div>
      </div>
    </div>
  </div>
</div>
</div>

<div class="veda-footer">
<div class="container">
	<div class="footer">
		<p>© Copyright 2018. All Rights Reserved.</p>
	</div>
</div>
</div>

<style>

.navbar-default .navbar-nav > li > a{
	color:#fff;
	font-size:18px;
}

</style>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
     <script src="js/bootstrap.js"></script>
     <!-- <script>
     	window.onload=function(){if(window.jQuery){$(document).ready(function(){$(".sidebarNavigation .navbar-collapse").hide().clone().appendTo("body").removeAttr("class").addClass("sideMenu").show();$("body").append("<div class='overlay'></div>");$(".navbar-toggle, .navbar-toggler").on("click",function(){$(".sideMenu").addClass($(".sidebarNavigation").attr("data-sidebarClass"));$(".sideMenu, .overlay").toggleClass("open");$(".overlay").on("click",function(){$(this).removeClass("open");$(".sideMenu").removeClass("open")})});$("body").on("click",".sideMenu.open .nav-item",function(){if(!$(this).hasClass("dropdown")){$(".sideMenu, .overlay").toggleClass("open")}});$(window).resize(function(){if($(".navbar-toggler").is(":hidden")){$(".sideMenu, .overlay").hide()}else{$(".sideMenu, .overlay").show()}})})}else{console.log("sidebarNavigation Requires jQuery")}}
     </script> -->
  </body>
</html>