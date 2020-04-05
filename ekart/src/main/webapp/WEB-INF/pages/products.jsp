<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<section id="productList">
		<div class="container">
			<c:forEach var="product" items="${productList}">
			<div class="row">
				<div class="col-sm-12 ">
					<div class="panel-footer">
            			<h3>${product.productName }</h3>
        			</div>
        			<div  class="row panel-body">
        			<div class=col-md-6>${product.description}</div>
        			<c:if test="${sessionScope.userId ne null}">
        				<a href="${pageContext.servletContext.contextPath}/${userId}/wishlist/${product.productId}/add" class="col-md-6 col-md-offset-8">
            				<button type="button" class="btn btn-primary" >Add to Wishlist</button></a>
            				</c:if>
        			</div>
        			<div class="row panel-body">
            			<div  class="col-md-3">Price: ${product.price} $</div>
            			<div  class="col-md-3">In Stock: ${product.quantity}</div>
            			<a href="${pageContext.servletContext.contextPath}/productDetails/${product.productId}" class="col-md-6 col-md-offset-8">
            				<button type="button" class="btn btn-primary" >View</button></a>
            		</div> 
            		
            		
            		
            		

				</div>
			</div>
			</c:forEach>
		</div>
	</section>