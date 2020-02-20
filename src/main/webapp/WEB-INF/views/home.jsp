<html xmlns:th="http://www.thymeleaf.org">
<%@ include file="header.jsp"%>
<body>
	<nav class="navbar navbar-light bg-light">
		<form class="form-inline" action="search" th:object="${search}" method="get">
			<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" id="search" name="search">
			<button id="submit" class="btn btn-outline-success my-2 my-sm-0" type="submit">Go!</button>
		</form>
		<div id="logout" class="btn my-2 my-sm-0" ><a href="/AtsTest/logout">Logout</a></div>
	</nav>
	<jsp:include page="../views/listElements.jsp" />
</body>
<%@ include file="footer.jsp"%>
</html>