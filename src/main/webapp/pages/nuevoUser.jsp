<%-- 
    Document   : nuevoAutor
    Created on : 01/11/2013, 08:57:47 PM
    Author     : Francisco
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
 
 
</head>
 
<body>
<h1>Nuevo usuario</h1>
 
<s:form action="guardarUsuario">
        <s:textfield label="Username" name="usuario.username"/>
	<s:textfield label="Password" name="usuario.password"/>
        <s:textfield label="Habilitado" name="usuario.enabled"/>
        <s:select label="Rol" list="roles" name="usuario.idRole" listKey="idRole" listValue="name"/>
	<s:submit value="Guardar"/>
</s:form>
 
</body>
</html>
