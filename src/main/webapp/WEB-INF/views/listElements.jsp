<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<ul id="listElements" class="list-group">
		<c:forEach var="element" items="${collection}">
			<li class="list-group-item"><div>ATM - Street: ${element.address.street} - House Number: ${element.address.housenumber} - Postal Code: ${element.address.postalcode} - City: ${element.address.city} - Latitude: ${element.address.geoLocation.lat} - Longitude: ${element.address.geoLocation.lng}</div>   
				<!-- <a href="#" ><span class="glyphicon glyphicon-pencil pull-right" aria-hidden="true" ></span></a> -->
		</c:forEach>
</ul>