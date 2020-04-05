<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
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
		<div class="col-md-offset-1">
			<a href="${pageContext.servletContext.contextPath}/home" >Go to Home.</a>
		</div>
	</header>
	<!-- /HEADER -->
