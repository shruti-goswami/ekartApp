<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ekart</title>


	<link rel="stylesheet" href="<c:url value='css/newstyle.css'/>"
	type="text/css" media="all">
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" 
	rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	 <link rel="stylesheet" href="<c:url value='css/custom.css'/>"
	type="text/css" media="all">
	
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>
</head>


<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<!-- LOGIN -->
		
	<div class="container  col-sm-5 col-right col-sm-offset-3 align-self-center" style="width:40%">
			<br> <br> <br>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="capital">Login</h4>
				</div>
				<div class="panel-body">
					<h3 class="red" id="msg2"></h3>
				
					<form:form method="POST" action="authenticateLogin"
						modelAttribute="command">

						
							<div class="form-group">
								<form:label path="email"
									class="control-label col-sm-offset-1 col-sm-3 text-right fontstyle">Email Id<span
										class="red">*</span>
								</form:label>
								<div class="col-sm-7">
									<form:input path="email" class="form-control" required="true" type="email" />
									<br>
									<form:errors path="email" />
								</div>
								<br>
							</div>
							<div class="form-group">
								<form:label path="password"
									class="control-label col-sm-offset-1 col-sm-3 text-right fontstyle">Password<span
										class="red">*</span>
								</form:label>
								<div class="col-sm-7">
									<form:input type="password" path="password" required="true" title="Password must contain 8 to 15 characters"
										class="form-control" pattern=".{8,15}"/>
											<!-- <a href="forgotPassword" class="help-text pull-right">Forgot Password?</a> -->
									<br>
									<form:errors path="password" />
								</div>
								<br>
							</div>
							<br><br><br><br>
							<div class="form-group">
								<div class="col-sm-offset-4 col-sm-7">
									<a href="register">New User?</a> &nbsp; <button
										type="submit" class="btn btn-primary fontfamily" >Login</button>
								</div>

							</div>
							
							
					</form:form>
					
					<div class="col-md-12 text-center">
            <div class="text-center text-danger">${message}</div>  
            </div>
					
					</div>
					
				</div>
			</div>
	</div>
	<!-- Login end -->

</body>
</html>