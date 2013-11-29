<%-- 
    Document   : accessdenied
    Created on : Sep 12, 2013, 2:44:34 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bloqueado</title>
    </head>
    <body>
        <!--<a href="<c:url value="/autorList" />" > Mantenimiento Autores</a>--><br>
         <a href="<c:url value="/programaList" />" > Mantenimiento de Programa</a><br>
        <a href="<c:url value="/usuariosList" />" > Mantenimiento Usuarios</a><br>
        <a href="<c:url value="/rolesList" />" > Mantenimiento Roles</a><br>
    </body>
</html>
