<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Satya Sanatan</title>

    <!-- Bootstrap -->

    <link rel="stylesheet" type="text/css" href="css/veda.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">



<style>
.cate-head{
	background: url('img/vedgranth.png');
	background-repeat: no-repeat;
    height: 100%;
    padding-bottom: 20%;
    box-shadow: 5px 4px 29px 1px grey;
   /* width: 54%;*/
    height: 300px;
    margin-bottom: 30px;
}

.cate-head1{
	background: url('img/bhagwat-gite.png');
	background-repeat: no-repeat;
    height: 100%;
    padding-bottom: 20%;
    box-shadow: 5px 4px 29px 1px grey;
   /* width: 54%;*/
    height: 300px;
    margin-bottom: 30px;

}

.cate-head2{
	background: url('img/ramayan.png');
	background-repeat: no-repeat;
    height: 100%;
    padding-bottom: 15%;
    box-shadow: 5px 4px 29px 1px grey;
   /* width: 54%;*/
    height: 300px;
    margin-bottom: 30px;
}

.cate-head3{
	background: url('img/mahabharat.png');
	background-repeat: no-repeat;
    height: 100%;
    padding-bottom: 15%;
    box-shadow: 5px 4px 29px 1px grey;
   /* width: 54%;*/
    height: 300px;
    margin-bottom: 30px;
}
.navbar-default .navbar-nav > li > a{
	color:#fff;
	font-size:18px;
}


</style>

  </head>
  <body style="font-family: 'Quicksand', sans-serif;">
   
 <div id="header" style="background:#ff9933">
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

<div class="veda-wrapper">
	<div class="container">
		<div class="col-sm-12 col-md-12">
			<div class="ved-text">
				<p>A Team of individual <b>Software Developers</b> who want to develop a platform to boost interest of this generation towards spirituality. The purpose is to create repository of Indian Texts and serve as a one stop shop of <b>Vedas</b> (RigVeda, YajurVeda, SamVeda, AtharvaVeda), <b>Upanishad</b> (Ishopanishad, Kathopanishad, Kenopanishad, Chhandogya Upanishad, Svetasvara Upanishad), <b>Itihas</b> (Valmiki Ramayan, Mahabharata), <b>Miscellaneous</b> (other than above mentioned)</p>
				<p>The original texts are in Sanskrit and you also have the option to browse through Hindi / English commentaries of the same.</p>
			</div>
		</div>
		<div class="ved-category">
		<div class="row">
			
            <c:forEach var="a" items="${Topic}">
			<div class="col-sm-1"></div>

			<div class="col-sm-5">
				<div class="cate-head col-sm-12">
					<div class="ved-categ col-md-12" align="center">
						<h2>${a.topic}</h2>
						<a href="User-Uploads?val=${a.topic}" class="btn btn-primary"> Read Now</a>
					</div>
				</div>
			</div>
			</c:forEach>

			<div class="col-sm-1"></div>

					<div class="col-sm-1"></div>


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


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
     <script src="js/bootstrap.js"></script>
     <!-- <script>
     	window.onload=function(){if(window.jQuery){$(document).ready(function(){$(".sidebarNavigation .navbar-collapse").hide().clone().appendTo("body").removeAttr("class").addClass("sideMenu").show();$("body").append("<div class='overlay'></div>");$(".navbar-toggle, .navbar-toggler").on("click",function(){$(".sideMenu").addClass($(".sidebarNavigation").attr("data-sidebarClass"));$(".sideMenu, .overlay").toggleClass("open");$(".overlay").on("click",function(){$(this).removeClass("open");$(".sideMenu").removeClass("open")})});$("body").on("click",".sideMenu.open .nav-item",function(){if(!$(this).hasClass("dropdown")){$(".sideMenu, .overlay").toggleClass("open")}});$(window).resize(function(){if($(".navbar-toggler").is(":hidden")){$(".sideMenu, .overlay").hide()}else{$(".sideMenu, .overlay").show()}})})}else{console.log("sidebarNavigation Requires jQuery")}}
     </script> -->
  </body>
</html>