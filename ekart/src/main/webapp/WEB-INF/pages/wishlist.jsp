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


<section id="wishList">
	<div class="container">
		<c:if test="${!(empty wishlistItems)}">
			<c:forEach var="product" items="${wishlistItems}">
				<div class="row">
					<div class="col-sm-12 ">
						<div class="panel-footer">
            				<h3>${product.productName }</h3>
        				</div>
        				<div  class="row panel-body">
        					<div  class="col-md-6">${product.description} </div>
            				<a class="col-md-6" href="${pageContext.servletContext.contextPath}/productDetails/${product.productId}" class="col-md-offset-9">
            					<button type="button" class="btn btn-primary" >View Details</button></a>
	        			</div>
    	    			<div class="row panel-body">
        	    			<div  class="col-md-6">Category : ${product.category} </div>
            				<a class="col-md-6" href="${pageContext.servletContext.contextPath}/${userId}/wishlist/${product.productId}/remove" class="col-md-offset-9">
            					<button type="button" class="btn btn-primary" > Remove from Wishlist</button></a>
            			</div>
	
					</div>
				</div>
			</c:forEach>
		</c:if>
		<c:if test="${empty wishlistItems}">
			<div class="text-center "><h4 class="fontstyle"><strong>No Product to display</strong></h4></div>  <br>
		</c:if>
	</div>
</section>

<script type="text/javascript"
		src="<c:url value='js/jquery.min.js'/>"></script>
	<!-- jQuery -->
	<script type="text/javascript"
		src="<c:url value='js/jquery.ajax-cross-origin.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='js/bootstrap.min.js'/>"></script>
	<!-- Bootstrap -->
	
	<script type="text/javascript"
		src="<c:url value='js/custom.js'/>"></script>
	<!-- custom -->