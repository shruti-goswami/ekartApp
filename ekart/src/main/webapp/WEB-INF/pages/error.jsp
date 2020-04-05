<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta>

<title>Ekart Shopping Application</title>

<!-- Main CSS file -->
<link rel="stylesheet"
	href="<c:url value='css/bootstrap.min.css'/>" />
<link rel="stylesheet"
	href="<c:url value='css/font-awesome.css'/>" />
<link rel="stylesheet"
	href="<c:url value='css/newstyle.css'/>" />
<link rel="stylesheet"
	href="<c:url value='css/responsive.css'/>" />
<link rel="stylesheet" href="<c:url value='css/custom.css'/>"
	type="text/css" media="all" />
<!-- Fonts -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
	rel="stylesheet" type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic"
	rel="stylesheet" type="text/css">

<!-- Favicon -->
<link rel="shortcut icon" href="/resources/static/travel/InfyGo.ico">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.4.0/bootbox.min.js"></script>
</head>
<body data-spy="scroll" data-target="#footer">

	<div class="row">
	<jsp:include page="header.jsp"></jsp:include>
	</div>
	<br>
	
	<br>
 
    <div  class="col-md-offset-4">
    <h3> Uh-Oh! Unable to load page. </h3>
    <div class="row"><a href="${pageContext.servletContext.contextPath}/home">Back to Home.</a>
    </div>
    </div>
    
    
    
    
    