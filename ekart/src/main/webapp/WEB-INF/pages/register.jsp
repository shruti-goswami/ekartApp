<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ekart</title>


	<link rel="stylesheet" href="<c:url value='/css/newstyle.css'/>"
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
</head>


<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<!-- SIGNUP -->
	

	
	<div class="container text-center col-center col-sm-offset-3 align-self-center" style="width : 80%">
		<div class="container col-sm-6 col-center signup" style="width : 50%">
		
			<div class="panel panel-default">
			
				<div class="panel-heading">
				<h3><i class="glyphicon glyphicon-user" style="font-size:2em;"></i></h3>
				<h4 class="capital">
								<spring:message code="register.register" text="Register" /> 
				</h4>
				
				</div>
				<div class="panel-body">
					<form:form method="POST" action="registerUser" modelAttribute="command" >
					    <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
					
							<spring:message code="register.name"
								text="Full Name" />
							<span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:input path="name" class="form-control" />
								<form:errors path="name" />
							</div>
							<br>
						</div>
						<br>
						<div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
					
							<spring:message code="register.email"
								 text="Email" />
							<span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:input path="email" class="form-control" />
								
								<form:errors path="email" />
							</div>
							<br>
						
						</div>
						<br>
						 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
					
							<spring:message code="register.pwd" text="Password"
								 />
							<span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:password path="password" class="form-control" />
								<form:errors path="password" />
							</div>
							<br>
						
						</div>
						<br>
						<div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
					
							<spring:message code="register.pwd" text="Confirm Password"
								 />
							<span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:password path="confirmPassword" class="form-control" /> 
								<form:errors path="confirmPassword" />
							</div>
							<br>
						
						</div>
						
						 
						 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-3 text-right fontstyle" >
					
						</div>
							<div class="col-sm-6">
								<input type="submit" class="btn btn-primary"
									value="<spring:message code="submit" text="Submit"/>"/>
							</div>
							<div class="col-md-12 text-center">
            <div class="text-center text-danger">${message}</div>  
            </div></div><br>
            <c:if test="${successMessage ne null}">
				<div class="alert alert-success col-md-12" align="center">${successMessage}
				<br>
				Click <a href="login" >
                        &nbsp;here </a>to login.
                  </div>
		</c:if>		
					</form:form>

				</div>
			</div>
			
		</div>
	</div>
		</div>
	<!-- /SIGNUP -->

</body>
</html>