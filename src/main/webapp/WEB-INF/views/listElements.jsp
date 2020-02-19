<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<ul id="listElements" class="list-group">
		<c:forEach var="element" items="${collection}">
			<li class="list-group-item"><a href="/AtsTest/ats/search/${element}">${element.address.street} - ${element.address.housenumber} - ${element.address.postalcode} - ${element.address.city}</a>   
				<!-- <a href="#" ><span class="glyphicon glyphicon-pencil pull-right" aria-hidden="true" ></span></a> -->
		</c:forEach>
		
	
</ul>