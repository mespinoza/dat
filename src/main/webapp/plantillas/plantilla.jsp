<%-- 
    Document   : plantilla
    Created on : 28/11/2013, 10:11:27 PM
    Author     : mespinoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>   
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/principal.css" type=text/css rel=stylesheet>
        <s:head/>
    </head>
    <body>
        
        <table>
		<tr>
			<td colspan="2">
				<!-- HEADER -->
                                <tiles:insertAttribute name="cabecera"/>
			</td>
		</tr>
		<tr>
                        <td style="width: 250px; vertical-align: top">
				<!-- MENU -->
                                <tiles:insertAttribute name="menu"/>
			</td>
			<td style="width: 550px;">
				<!-- BODY -->
                                <tiles:insertAttribute name="cuerpo"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<!-- FOOTER -->
                                <tiles:insertAttribute name="pie"/>
			</td>
		</tr>
	
	
	</table>
    
    </body>
</html>
