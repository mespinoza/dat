

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
 
</head>
 
<body>
 
<s:if test="hasActionErrors()">
   <div class="errors">
      <s:actionerror/>
   </div>
</s:if>
<table>
    <tr>
    <th>titulo</th>
    <th>descripcion</th>
    <th>objetivos</th>
    <th>requisitos</th>
    <th>precio</th>
    <th>duracion</th>
    <th>estado</th>
    <th>ACCION</th>
    
    </tr>
<s:iterator value="programas">
    <tr><td><s:property value="titulo"/></td>
        <td><s:property value="descripcion"/></td>
        <td><s:property value="objetivos"/></td>
        <td><s:property value="requisitos"/></td>
        <td><s:property value="precio"/></td>
        <td><s:property value="duracion"/></td>
        <td><s:property value="estado"/></td>
       <td><a href="eliminarPrograma?id=<s:property value="idprograma"/>">Eliminar</a></td> 
    </tr>
</s:iterator>
</table>
<a href="nuevoPrograma">Agregar nuevo Programa</a>
</body>
</html>
