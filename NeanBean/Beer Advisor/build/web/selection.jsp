<%-- 
    Document   : selection
    Created on : Nov 30, 2018, 11:48:53 PM
    Author     : lukpheakdey
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection Advice</title>
    </head>
    <body>
        <h1>Beer Selection Advice</h1>
        <c:forEach var="item" items="${sessionScope.styles}">
            Try: ${item} <br>
        </c:forEach>
    </body>
</html>
