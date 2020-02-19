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
			<!-- <a href="/AtsTest/main">Enter</a> -->
			<h1>Login</h1>
			<form name='f' action="main" method='POST'>
				<table>
					<tr>
						<td>User:</td>
						<td><input type='text' name='username' value=''></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type='password' name='password' /></td>
					</tr>
					<tr>
						<td><input name="submit" type="submit" value="submit" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>
