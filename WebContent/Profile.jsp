<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<div class="row">
		<div>
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4>Your Profile</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">
		                    <form>
                              <div class="form-group row">
                                <label for="username" class="col-4 col-form-label">Email</label> 
                                <div class="col-8">
                                  <input id="username" name="username" class="form-control here" value="<c:out value="${user.email}"/>"  type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="name" class="col-4 col-form-label">User name</label> 
                                <div class="col-8">
                                  <input id="name" name="name"  class="form-control here" value="<c:out value="${user.username}"/>" type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="lastname" class="col-4 col-form-label">Country</label> 
                                <div class="col-8">
                                  <input id="lastname" name="lastname" class="form-control here" value="<c:out value="${user.country}"/>" type="text">
                                </div>
                              </div>
                            </form>
		                </div>
		            </div>
		            
		        </div>
		    </div>
		</div>
	</div>
</div>
</body>
</html>