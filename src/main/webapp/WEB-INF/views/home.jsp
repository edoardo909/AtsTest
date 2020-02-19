<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<%@ include file="header.jsp"%>
<head>
<title>Home</title>
</head>
<body>
	<div class="container" align="center">
		<h1>Homepage</h1>
		<P>The time is ${serverTime}.</P>
		<div>
			<a href="/AtsTest/ats/search">Enter</a>
		</div>
	</div>
</body>
<%@ include file="footer.jsp" %>
</html>
