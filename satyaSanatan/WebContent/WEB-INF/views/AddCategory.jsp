<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    	    <jsp:include page="/commonView/dashboard.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script  type="text/javascript">

$(document).ready(function(){  
 $('#update').click(function(){  

	 $('#myModal').modal('hide');  
	 $('#confirm').modal('show');  
 	});
});
 function getdata(id){
     var id = id;  
	$.ajax({
		
		type : 'POST',
		url : 'Get-Main-Category',
		data : { "val" : id },
		dataType : 'JSON',
		success : function(data) {
			$('#catID').val(data.id);
			$('#catName').val(data.catName);
		 	$('#catTitle').val(data.catTitle);
		 	$('#desc').val(data.catDiscription);
		 	$('#myModal').modal('show');
		},
		error : function(request, status, error) {
			alert(request.responseText);
		}
	}); 
 }



function deletedata(id) {
	var r = confirm('Are you sure to DELETE Entry?');
    if (r == true) {
	$.ajax({
		
		type : 'POST',
		url : 'deleteMainCat',
		data : {
			"val" : id
		},
		dataType : 'JSON',
		success : function(response) {
			alert("Entry Deleted Successfully")
			location.reload();

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

</head>
<body>


<div id="right-panel" class="right-panel">
<header id="header" class="header">

            <div class="header-menu">

                <div class="col-sm-7">
                    <a id="menuToggle" class="menutoggle pull-left"><i class="fa fa fa-tasks"></i></a>
                    <div class="header-left">
                        <button class="search-trigger"><i class="fa fa-search"></i></button>
                        <div class="form-inline">
                            <form class="search-form">
                                <input class="form-control mr-sm-2" type="text" placeholder="Search ..." aria-label="Search">
                                <button class="search-close" type="submit"><i class="fa fa-close"></i></button>
                            </form>
                        </div>

                        <div class="dropdown for-notification">
                          <button class="btn btn-secondary dropdown-toggle" type="button" id="notification" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fa fa-bell"></i>
                            <span class="count bg-danger">5</span>
                          </button>
                          <div class="dropdown-menu" aria-labelledby="notification">
                            <p class="red">You have 3 Notification</p>
                            <a class="dropdown-item media bg-flat-color-1" href="#">
                                <i class="fa fa-check"></i>
                                <p>Server #1 overloaded.</p>
                            </a>
                            <a class="dropdown-item media bg-flat-color-4" href="#">
                                <i class="fa fa-info"></i>
                                <p>Server #2 overloaded.</p>
                            </a>
                            <a class="dropdown-item media bg-flat-color-5" href="#">
                                <i class="fa fa-warning"></i>
                                <p>Server #3 overloaded.</p>
                            </a>
                          </div>
                        </div>

                        <div class="dropdown for-message">
                          <button class="btn btn-secondary dropdown-toggle" type="button"
                                id="message"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="ti-email"></i>
                            <span class="count bg-primary">9</span>
                          </button>
                          <div class="dropdown-menu" aria-labelledby="message">
                            <p class="red">You have 4 Mails</p>
                            <a class="dropdown-item media bg-flat-color-1" href="#">
                                <span class="photo media-left"><img alt="avatar" src="images/avatar/1.jpg"></span>
                                <span class="message media-body">
                                    <span class="name float-left">Jonathan Smith</span>
                                    <span class="time float-right">Just now</span>
                                        <p>Hello, this is an example msg</p>
                                </span>
                            </a>
                            <a class="dropdown-item media bg-flat-color-4" href="#">
                                <span class="photo media-left"><img alt="avatar" src="images/avatar/2.jpg"></span>
                                <span class="message media-body">
                                    <span class="name float-left">Jack Sanders</span>
                                    <span class="time float-right">5 minutes ago</span>
                                        <p>Lorem ipsum dolor sit amet, consectetur</p>
                                </span>
                            </a>
                            <a class="dropdown-item media bg-flat-color-5" href="#">
                                <span class="photo media-left"><img alt="avatar" src="images/avatar/3.jpg"></span>
                                <span class="message media-body">
                                    <span class="name float-left">Cheryl Wheeler</span>
                                    <span class="time float-right">10 minutes ago</span>
                                        <p>Hello, this is an example msg</p>
                                </span>
                            </a>
                            <a class="dropdown-item media bg-flat-color-3" href="#">
                                <span class="photo media-left"><img alt="avatar" src="images/avatar/4.jpg"></span>
                                <span class="message media-body">
                                    <span class="name float-left">Rachel Santos</span>
                                    <span class="time float-right">15 minutes ago</span>
                                        <p>Lorem ipsum dolor sit amet, consectetur</p>
                                </span>
                            </a>
                          </div>
                        </div>
                    </div>
                </div>

                <div class="col-sm-5">
                    <div class="user-area dropdown float-right">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <img class="user-avatar rounded-circle" src="images/admin.jpg" alt="User Avatar">
                        </a>

                        <div class="user-menu dropdown-menu">
                                <a class="nav-link" href="#"><i class="fa fa- user"></i>My Profile</a>

                                <a class="nav-link" href="#"><i class="fa fa- user"></i>Notifications <span class="count">13</span></a>

                                <a class="nav-link" href="#"><i class="fa fa -cog"></i>Settings</a>

                                <a class="nav-link" href="#"><i class="fa fa-power -off"></i>Logout</a>
                        </div>
                    </div>


                </div>
            </div>

        </header>
				<div class="row">
                    <div class="col-xs-10 col-sm-10" style="margin: 65px">
                        <div class="card">
                            <div class="card-header">
                                <strong>Add Category</strong> <small> (Main)</small>
                            </div>
                            <div class="card-body card-block">		
		
					<form action="Add-Main-Category-Value"  enctype="multipart/form-data" method="post">
			
							<div class="form-group">
                                    <label class=" form-control-label">Category Name</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                        <input type="text" name="CatName" class="form-control" >
                                    </div>
                                    <small class="form-text text-muted">Category Title </small>
                                </div>
                                <div class="form-group">
                                    <label class=" form-control-label"> Category Title</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-phone"></i></div>
                                         <input type="text" name="catTitle" class="form-control" >
                                        
                                    </div>
                                    <small class="form-text text-muted">ex. (999) 999-9999</small>
                                </div>
                                <div class="form-group">
                                    <label class=" form-control-label">Category Discription</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-usd"></i></div>
                                <textarea type="text" name="catDiscription" class="form-control" rows="3" ></textarea>
                                        
                                    </div>
                                    <small class="form-text text-muted">Maximum 100 Words</small>
                                </div>
                                <div class="form-group">
                                    <label class=" form-control-label">Upload Image</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-male"></i></div>
                                        <input type="file" class="form-control" name="files"  >
                                    </div>
                                    <small class="form-text text-muted">Only JPEG,jpg,png</small>
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
                                        	 	<th>Image</th>
				                        		<th>Category</th>
                				        		<th>Title</th>
                       				 			<th>Description</th>
                    				    		<th>Action</th>
                      					</tr>
                    </thead>
                    <tbody>
                    <c:forEach var="a" items="${maincatValues}">
                    <tr>
                    <td>
                    <img alt="image" src="/SatyaSanatan/${a.fileName}" >
                    </td>
                    <td>${a.catName}</td>
                    <td>${a.catTitle}</td>
                    <td>${a.catDiscription}</td>

					<td>
					
                  	<a role="button" onclick="getdata('${a.id}')"><i class="fa fa-edit" style="font-size:24px"></i></a>
					&nbsp;&nbsp;&nbsp;
                  	<a role="button" onclick="deletedata('${a.id}')"><i class="fa fa-trash-o" style="font-size:24px"></i></a>
					
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

<!-- Modal -->

   <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">     
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <h3 class="modal-title">Edit Information</h3>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <div class="modal-body">
                            <div class="card-body card-block">		
		
                    <form action="Add-Main-Category-Value"  enctype="multipart/form-data" id="insertForm" method="post">
						<input type="hidden" name="id" id="catID"/>
                                    <small class="form-text text-muted">ex. (999) 999-9999</small>
							<div class="form-group">
                                    <label class=" form-control-label">Category Name</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
									<input type="text" name="CatName" class="form-control" id="catName">
                                    </div>
                                    <small class="form-text text-muted">Category Title </small>
                                </div>
                                <div class="form-group">
                                    <label class=" form-control-label"> Category Title</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-phone"></i></div>
									<input type="text" name="catTitle" class="form-control" id="catTitle">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class=" form-control-label">Category Discription</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-usd"></i></div>
							
							<textarea name="catDiscription" class="form-control" rows="3" id="desc"></textarea>
                                        
                                    </div>
                                    <small class="form-text text-muted">Maximum 100 Words</small>
                                </div>
                                <div class="form-group">
                                    <label class=" form-control-label">Upload Image</label>
                                    <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-male"></i></div>
                                        <input type="file" class="form-control" name="files" id="filePath" >
                                    </div>
                                    <small class="form-text text-muted">Only JPEG,jpg,png</small>
                                </div>
                             
                                <div class="form-group">
                                    <div class="input-group">
    			    <input type="submit" value="Update" class="btn btn-info" id="update">
                                    </div>
                                    </div>
			</form>									
                                </div>
                            </div>
                        </div>
                    </div>

        <div class="modal-body">
		
    </div>
        </div>

<!-- Modal end-->

  <div class="modal fade" id="confirm" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
          <h3>Updated Successfully!</h3>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">OK</button>
                                        
        </div>
      </div>
      
  </div>



</body>
</html>