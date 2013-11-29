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
 
<s:form action="guardarPrograma">
        <s:textfield label="titulo" name="programa.titulo"/>
	<s:textfield label="descripcion" name="programa.descripcion"/>
	<s:textfield label="objetivos" name="programa.objetivos"/>
        <s:textfield label="requisitos" name="programa.requisitos"/>
        <s:textfield label="precio" name="programa.precio"/>
        <s:textfield label="duracion" name="programa.duracion"/>
        <s:textfield label="estado" name="programa.estado"/>
       
	<s:submit value="Guardar"/>
</s:form>
 
</body>
</html>
