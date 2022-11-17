
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Welcome</title>
</head>
<body>

<h1>RECHERCHE EMPLOYE</h1>
<form:form method="post" action="${pageContext.request.contextPath}/listesdto"  modelAttribute="employe">
    <p><form:label path="idEmp">id Employe : </form:label> <form:input type="text" path="idEmp"/></p>
    <p><button type="submit">rechercher</button></p>
</form:form>

</body>
</html>
