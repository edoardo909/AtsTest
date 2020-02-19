<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html xmlns:th="http://www.thymeleaf.org">
<%@ include file="header.jsp"%>
<head>
<title>Home</title>
</head>
<body>
	<div class="container" align="center">
		<P>The time is ${serverTime}.</P>
		<div>
			<h1>Login</h1>
			<form th:action="@{/home}" method="post" role="form"
				autocomplete="off">
				<h1 class="text-center text-success login-title">
					<span th:text="Login"></span>
				</h1>
				<div class="form-group">
					<input type="text" id="username" name="username"
						class="form-control" placeholder="username" maxlength="10" />
				</div>
				<div class="form-group">
					<input type="password" id="password" name="password"
						class="form-control" placeholder="password" />
				</div>
				<div class="form-group">
					<button class="btn btn-lg btn-success btn-block" type="submit"
						id="login" value="login" th:text="Login"></button>
				</div>
			</form>
		</div>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>
