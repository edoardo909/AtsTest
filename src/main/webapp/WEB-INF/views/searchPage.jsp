<html>
<%@ include file="header.jsp"%>
<body>
<nav class="navbar navbar-light bg-light">
  <form class="form-inline" action="../ats/search/" method="GET">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" value="${search}">
    <button id="submit" class="btn btn-outline-success my-2 my-sm-0" type="submit"
    	onclick="window.location.href='../ats/search/${search}'">Go!</button>
  </form>
</nav>
<jsp:include page="../views/listElements.jsp"/>
</body>
<%@ include file="footer.jsp" %>
</html>