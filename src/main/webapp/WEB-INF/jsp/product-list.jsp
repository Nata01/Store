<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Catalogue</title>
</head>
<body>
<h1>Welcome to catalogue</h1>
<c:forEach items="${productNames}" var="name">
    ${name}<br>
</c:forEach>
</body>
</html>
