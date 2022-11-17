<%--
  Created by IntelliJ IDEA.
  User: o2175246@campus.univ-orleans.fr
  Date: 17/11/2022
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>L'employe :</h2>

<c:forEach var="listesdto" items="listesdto">
    <c:out value="${listesdto.nom}" />
    <c:out value="${listesdto.prenom}" />
</c:forEach>



<form action="${pageContext.request.contextPath}/">
    <button type="submit">Retour au menu</button>
</form>


</body>
</html>
