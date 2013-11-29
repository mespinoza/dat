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
            <td><h1>Struts 2 Example</h1></td>
            <td style="text-align: right;"><a href="<c:url value='j_spring_security_logout' />">Logout</a></td>
        </tr>
    </table>

 

<table>
    <tr>
    <th>Nombres</th>
    <th>Apellido Paterno</th>
    <th>Apellido Materno</th>
    <th>Accion</th>
    </tr>
<s:iterator value="autores">
    <tr><td><s:property value="nombres"/></td>
        <td><s:property value="apePaterno"/></td>
        <td><s:property value="apeMaterno"/></td>
        <td><a href="eliminarAutor?id=<s:property value="idAutor"/>">Eliminar</a></td>
    </tr>
</s:iterator>
</table>
<a href="nuevoAutor">Agregar nuevo autor</a>
</body>
</html>
