<div style="width:50%">
<spring:url value="/searchProduct/${productName}" var="searchProductUrl" />
<form  action="<spring:url value="/searchProduct"/>" >
      				<div class="input-group">
        				<input type="text" class="form-control" placeholder="Search" name="productName" >
    					<div class="input-group-btn">
      						<button class="btn btn-default" type="submit" onClick=>
        						<i class="glyphicon glyphicon-search"></i>
      						</button>
    					</div>
      				</div>
</form>	
</div>
