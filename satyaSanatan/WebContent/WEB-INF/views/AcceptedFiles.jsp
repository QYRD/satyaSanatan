<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    	    <jsp:include page="/commonView/dashboard.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Miscellenous Data</title>
    <meta name="description" content="Satya Sanatan Admin - HTML5 Admin Template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

   <!-- -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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

<!--Table Look Start-->
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
									    <th>Name</th>
									    <th>Mobile</th>
									     <th>Mail</th>
									    <th>File Description</th>
									    <th>Topic</th>
									    <th>Action</th>
                      					</tr>
                    </thead>
                    <tbody>

					<c:forEach var="a" items="${AcceptedFIles}">
				    <tr>
				    <td>${a.name}</td>
				    <td>${a.mobile}</td>
				    <td>${a.mail}</td>
				    <td>${a.fileDiscription}</td>
				    <td>${a.topic}</td>

					<td>					
					<a role="button" onclick="DeclineData('${a.id}')" title="Decline"><i class="fa fa-times" style="font-size:24px;color:#333333"></i></a>
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
<!--Table Look End-->
                  
                  
 <style>
.navbar-default{
background: transparent !important;
border: none !important;
}
</style>
 
  <script type="text/javascript">
	function DeclineData(id){
 		var id = id; 
 		$.ajax({
 			type : 'POST',
 			url : 'Misc-Decline-Data',
 			data : { "val" : id },
 			dataType : 'JSON', 
 			success : function(response){
 			location.reload();
 			},
 			error : function(request, status, error) {
 				alert(request.responseText);
 			}
	}); 
 	}
 	
  </script>
                  

</body>
</html>