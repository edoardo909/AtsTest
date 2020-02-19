<html>
<%@ include file="header.jsp"%>
<body>
<nav class="navbar navbar-light bg-light">
  <form class="form-inline" action="/ats/results/" method="GET">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" value="${title}">
    <button id="submit" class="btn btn-outline-success my-2 my-sm-0" type="submit"
    	onclick="window.location.href='../ats/search/${search}'">Search</button>
  </form>
</nav>
</body>
<%@ include file="footer.jsp" %>
</html>