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
<link rel="stylesheet" href="<c:url value='rss/custom.css'/>"
	type="text/css" media="all" />
<!-- Fonts -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
	rel="stylesheet" type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic"
	rel="stylesheet" type="text/css">

<!-- Favicon -->
<link rel="shortcut icon" href="/resources/travel/InfyGo.ico">
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


	<%-- <!-- HEADER -->
	<header id="header">
		<nav class="navbar st-navbar navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#st-navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="logo1" href=""><img
						src="<c:url value='/resources/images/infygonew.PNG'/>" alt=""></a>		 
				</div>

				<div class="collapse navbar-collapse margintop-20" id="st-navbar-collapse">
					<div class="">
						<ul class="nav navbar-nav navbar-right margintop-5">
							<li><a class="btn btn-xs  nav-links-right"
								href="${pageContext.servletContext.contextPath}/"> <span class="glyphicon glyphicon-home"></span>&nbsp;Home
							</a></li>
						</ul>
					</div>
				</div>
			</div>
		</nav>
	</header>
	<!-- /HEADER -->
	 --%>
	 
	 <jsp:include page="header.jsp"></jsp:include>
	<!--  Product Details -->
	<section id="productDetails">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 ">
					<div class="panel-footer">
            			<h3>${productDetails.productName }</h3>
        			</div>
        			<div  class="panel-body">${productDetails.description}</div>
        			<div class="row panel-body">
            			<div  class="col-md-2">Price: ${productDetails.price} $</div>
            			<div  class="col-md-9">Discount: ${productDetails.discount}</div>
            		</div>
            		<div class="panel-body">Price for You :<c:set var="productPrice" value= "${productDetails.price}"/>
            			<c:set var="discount" value="${productDetails.discount}"/> 
            		<c:out value="${productPrice - (productPrice*discount/100)}"></c:out>
         			</div>
         			<div class="row panel-body">
         				<div class = "col-md-2">Delivery Charges : ${productDetails.deliveryCharge}</div>
         				<div class="col-md-9">Average Rating : ${productDetails.average_rating}</div>
         			</div>

				</div>
			</div>
		</div>
	</section>
	
	
	
