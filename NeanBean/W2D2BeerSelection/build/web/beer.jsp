
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection Advise</title>
    </head>
    <body>
        <h1>Beer Selection Advise</h1>
        <c:forEach var="b" items="${brands}">
            try:${b}<br>
        </c:forEach>
    </body>
</html>
