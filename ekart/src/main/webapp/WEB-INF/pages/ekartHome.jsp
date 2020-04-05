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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.4.0/bootbox.min.js"></script>
	
<script type="text/javascript">
 function showWishList(wishlistAddMessage){
	 console.log("wish list".concat(wishlistAddMessage));
	 if(wishlistAddMessage != null && (wishlistAddMessage != "")){
		 alert(wishlistAddMessage);
		 console.log("in showWIshlist if");
	 }
 }
 
</script>
</head>
<body data-spy="scroll" data-target="#footer" onload="showWishList('${wishlistAddMessage}')" >
<%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  %> 
	<div class="row">
	<!-- HEADER -->
	<header id="header">
		<nav class="navbar st-navbar ">
			<div class="container-fluid">
				
				<c:if test="${sessionScope.userId eq null}">
				<ul class="nav navbar-nav  ">
								<li class="active">&nbsp;&nbsp;&nbsp;Shopping @ Ekart
								</li>
				</ul>
				<ul class="nav navbar-nav navbar-right margintop-5" >
					<li><a class="btn btn-xs  nav-links-right"
								href="register"> <span class="glyphicon glyphicon-user"></span>&nbsp;Sign
									Up
						</a>
					</li>
					<li><a class="btn btn-xs .nav-links-right" href="${contextPath}/login">
									<span class="glyphicon glyphicon-log-in"></span>&nbsp;Login
						</a>
					</li>
				</ul>
				</c:if>
				<c:if test="${sessionScope.userId ne null}">
				<div class="collapse navbar-collapse " id="st-navbar-collapse">
			
						
							<ul class="nav navbar-nav  ">
								<li class="active "><h3>&nbsp;&nbsp;&nbsp;Shopping @ Ekart</h3>
								</li>
							</ul>
							<ul class="nav navbar-nav navbar-right">
								<li><a class="btn btn-xs  nav-links-right"
								href="${contextPath}/${userId}/wishlist"> <span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;My Wishlist
									</a></li>
								<li><a class="btn btn-xs .nav-links-right" href="${contextPath}/modifyDetails">
									<span class="glyphicon glyphicon-edit"></span>&nbsp;Modify Details
								</a></li>
								<%-- <li><a class="btn btn-xs .nav-links-right" href="${pageContext.servletContext.contextPath}/logout">
									<span class="glyphicon glyphicon-log-out"></span>&nbsp;Logout
								</a></li> --%>
							</ul>
				</div>
				</c:if>
				
			</div>
		</nav>
		
	</header>	<c:if test="${logoutMessage ne null }">
        			 <div class="text-center text-danger"><h4 class="fontstyle"><strong>${logoutMessage}</strong></h4></div>  <br>
      				     
   				</c:if>
	</div>
	<br>
	
	<br>
	<%-- <c:if test="${wishlistAddMessage ne null }">
        			 <div class="alert alert-success col-md-12" align="center"><h4 class="fontstyle"><strong>${wishlistAddMessage}</strong></h4></div>  <br>
      				     
   				</c:if> --%>
	<!-- PRODUCT LIST --> 
	<jsp:include page="products.jsp"></jsp:include>

	<!-- JS -->
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



</body>
</html>