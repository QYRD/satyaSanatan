<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    	    <jsp:include page="/commonView/dashboard.jsp" />
        
        <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags must come first in the head; any other head content must come after these tags -->
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="css/veda.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
 
  <head><title>Upload Document</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script type="text/javascript">
 	function ApproveData(id){
 		debugger;
 		alert(id);
 		var id = id; 
 		$.ajax({
 			type : 'POST',
 			url : 'Misc-Approve-Data',
 			data : { "val" : id },
 			dataType : 'JSON', 
 			success : function(response){
 			alert("Approved!"),
 			/* window.location='ShowMisc';
 			 */
 			 location.reload();
 			 },
 			error : function(request, status, error) {
 				alert(request.responseText);
 			}
	}); 
 	}
 	
 	function DeclineData(id){
 		alert(id);
 		var id = id; 
 		$.ajax({
 			type : 'POST',
 			url : 'Misc-Decline-Data',
 			data : { "val" : id },
 			dataType : 'JSON', 
 			success : function(response){
 			alert("Declined!"),
 			window.location='ShowMisc';
 			},
 			error : function(request, status, error) {
 				alert(request.responseText);
 			}
	}); 
 	}

 	
  </script>
 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 </head>
  <body>
    <table id="bootstrap-data-table" class="table table-striped table-bordered">
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
	<c:forEach var="a" items="${MiscList}">
    <tr>
    <td>${a.name}</td>
    <td>${a.mobile}</td>
    <td>${a.mail}</td>
    <td>${a.fileDiscription}</td>
    <td>${a.topic}</td>
	<td>					
	<input value="Approve" onclick="ApproveData('${a.id}')" type="submit" id="btnApprv" class="btn btn-info">
	<input value="Decline" onclick="DeclineData('${a.id}')" type="submit" id="btndcln" class="btn btn-info">
	<input value="Download" onclick="DeclineData('${a.id}')" type="submit" id="btnDown" class="btn btn-info">	
	</td> 
	</tr>                    
    </c:forEach>
	 </tbody>
    </table>
 </body>

</html>