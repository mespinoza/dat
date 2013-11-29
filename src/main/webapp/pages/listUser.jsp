<%-- 
    Document   : listAutor
    Created on : 01/11/2013, 08:49:03 PM
    Author     : Francisco
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
 
</head>
 
<body>
    <table>
        <tr>
            <td><h1>Mantenimiento de usuarios</h1></td>
            <td></td>
        </tr>
    </table>


<table>
    <tr>
    <th>ID</th>
    <th>Username</th>
    <th>Password</th>
    <th>Enabled</th>
    <th>Accion</th>
    </tr>
<s:iterator value="usuarios">
    <tr><td><s:property value="idUser"/></td>
        <td><s:property value="username"/></td>
        <td><s:property value="password"/></td>
        <td><s:property value="enabled"/></td>
        <td><a href="eliminarUsuario?id=<s:property value="idUser"/>">Eliminar</a></td>
    </tr>
</s:iterator>
</table>
<a href="nuevoUsuario">Agregar nuevo usuario</a>
</body>
</html>
