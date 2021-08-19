<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib prefix="mo" uri="http://www.springframework.org/tags/form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign_up</title>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
.form-signin
{
    max-width: 330px;
    padding: 15px;
    margin: 0 auto;
}
.form-signin .form-signin-heading, .form-signin .checkbox
{
    margin-bottom: 10px;
}
.form-signin .checkbox
{
    font-weight: normal;
}
.form-signin .form-control
{
    position: relative;
    font-size: 16px;
    height: auto;
    padding: 10px;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}
.form-signin .form-control:focus
{
    z-index: 2;
}
.form-signin input[type="text"]
{
    margin-bottom: -1px;
    border-bottom-left-radius: 0;
    border-bottom-right-radius: 0;
}
.form-signin input[type="password"]
{
    margin-bottom: 10px;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
}
.account-wall
{
    margin-top: 20px;
    padding: 40px 0px 20px 0px;
    background-color: #f7f7f7;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
}
.login-title
{
    color: #555;
    font-size: 18px;
    font-weight: 400;
    display: block;
}
.profile-img
{
    width: 96px;
    height: 96px;
    margin: 0 auto 10px;
    display: block;
    -moz-border-radius: 50%;
    -webkit-border-radius: 50%;
    border-radius: 50%;
}
.need-help
{
    margin-top: 10px;
}
.new-account
{
    display: block;
    margin-top: 10px;
}

.error{
      padding: 0 30px 0 50px;
      /*color: #999;*/
       font-size: 16px;
      max-height: 0;
      transition: 0.28s;
      overflow: hidden;
      color: red;
      font-style: italic;
    } 


</style>
</head>
<body>


	<div class="container">
	    <div class="row">
	        <div class="col-sm-6 col-md-4 col-md-offset-4">
	            <h1 class="text-center login-title">Sign in to continue !!</h1>
	            
			    <span style="color: red;">${msg1}</span>
		
				<span style="color: red;">${msg2}</span>
		
	            <div class="account-wall">
	                <img class="profile-img" src="<%=request.getContextPath()%>/resources/img/photo.png" alt="image_face">
	               <mo:form action="loginProcessing" class="form-signin" method="post" modelAttribute="modeltwo">
	               
	                <mo:input path="emailid" type="text" class="form-control" placeholder="Email" />
	                <mo:input path="pwd" type="password" class="form-control" placeholder="Password" />
	                <mo:button class="btn btn-lg btn-primary btn-block" type="submit">
	                    Sign in</mo:button>
	               
	                <span class="clearfix"></span>
	                </mo:form>
	            </div>
	            <a href="/Niaagro/signup" class="text-center new-account">Create an account </a>
	             
	        </div>
	    </div>
	    

	</div>





</body>
</html>