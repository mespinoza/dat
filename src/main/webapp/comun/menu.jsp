<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
    
    
        
        
    <li>
        <a href="<c:url value="/j_spring_security_logout" />" > Salir</a>
    </li>

    <li>
        <a href="<c:url value="/programaList" />" > Mantenimiento de Programa</a><br>
    </li>

    <li>
       <a href="<c:url value="/usuariosList" />" > Mantenimiento Usuarios</a><br>
    </li>

    <li>
        <a href="<c:url value="/rolesList" />" > Mantenimiento Roles</a><br>
    </li>

</ul>   
