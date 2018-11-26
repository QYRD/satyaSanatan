<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    	    <jsp:include page="/commonView/dashboard.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Satya Sanatan Admin Panel</title>
    <meta name="description" content="Satya Sanatan Admin - HTML5 Admin Template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

   <!-- -->

    <link rel="stylesheet" href="assets/css/normalize.css">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/themify-icons.css">
    <link rel="stylesheet" href="assets/css/flag-icon.min.css">
    <link rel="stylesheet" href="assets/css/cs-skin-elastic.css">
    <!-- <link rel="stylesheet" href="assets/css/bootstrap-select.less"> -->
    <link rel="stylesheet" href="assets/scss/style.css">
    <link href="assets/css/lib/vector-map/jqvmap.min.css" rel="stylesheet">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>

    <!-- <script type="text/javascript" src="https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js"></script> -->

</head>

<body>

  <!-- Right Panel -->

    <div id="right-panel" class="right-panel">

        <!-- Header-->
        <header id="header" class="header">

            <div class="header-menu">

                <div class="col-sm-7">
                   <a id="menuToggle" class="menutoggle pull-left" style="background: #ff9933;"><i class="fa fa fa-tasks" style="margin-top: 14px;"></i></a>
                    <div class="header-left">
                                            

                       
                    </div>
                </div>

                <div class="col-sm-5">
                    
                    <div class="language-select dropdown" id="language-select">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown"  id="language" aria-haspopup="true" aria-expanded="true">
                            <i class="flag-icon flag-icon-in"></i>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="language" >
                            <div class="dropdown-item">
                                <span class="flag-icon flag-icon-fr"></span>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-es"></i>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-us"></i>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-it"></i>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

        </header><!-- /header -->
        <!-- Header-->


				<div class="row">
                    <div class="col-xs-10 col-sm-10" style="margin: 65px">
                        <div class="card">

                            <div class="card-body card-block">		
		
					<form action="Add-Topic-Value"  enctype="multipart/form-data" method="post">
			
                                <div class="form-group">
                                    <label class=" form-control-label"> Add Topic</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-phone"></i></div>
                                         <input type="text" name="topic" class="form-control" >             
                                    </div>
                               </div>
                                

                             
                                <div class="form-group">
                                    <div class="input-group">
                                        <input type="submit" value="Submit" class="btn btn-info"  >
                                    </div>
                                    </div>
					</form>									
                                </div>
                            </div>
                        </div>
                    </div>
            <div class="content mt-3 col-sm-10" style="margin: 65px">
            	<div class="animated fadeIn">
               	 <div class="row">
	                <div class="col-md-12">
    	                <div class="card">
        	                <div class="card-header">
            	                <strong class="card-title">Data Table</strong>
               	            </div>
                      		  <div class="card-body">       
				                  <table id="bootstrap-data-table" class="table table-striped table-bordered" >
               					     <thead>
                      					<tr>
                       				 			<th>Topic ID</th>
                    				    		<th>Topic Name</th>
                    				    		<th>Action</th>
                      					</tr>
                    </thead>
                    <tbody>
                    <c:forEach var="a" items="${getTopic}">
                    <tr>
                    <td>${a.id}</td>
                    <td>${a.topic}</td>														

					<td>
                  	<a role="button" onclick="deletedata('${a.id}')" title="Delete"><i class="fa fa-trash-o" style="font-size:24px"></i></a>
					</td>

                    </tr>
                    </c:forEach>
                    </tbody>
                  </table>
                        </div>
                    </div>
                </div>
                </div>
            </div>
        </div>
</div>

<style>
.navbar-default{
background: transparent;
border: none;
}
</style>


<script  type="text/javascript">


function deletedata(id) {
	var r = confirm('Are you sure to DELETE Entry?');
    if (r == true) {
	$.ajax({
		
		type : 'POST',
		url : 'deleteTopics',
		data : {
			"val" : id
		},
		dataType : 'JSON',
		success : function(response) {
			alert("Entry Deleted Successfully")
			window.location = "Add-Topic";

		},
		error : function(request, status, error) {
			alert(request.responseText);
		}
	});
    }
    else {
		alert("Not Deleted!");
    }
}
</script>


</body>
</html>