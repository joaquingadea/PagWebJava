<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados:</h1>
        
        <%
        List <Usuario> listaUs = (List) session.getAttribute("listaUsuarios");
        int cont = 1;
        for(Usuario usu : listaUs){%>
        <label>Usuario nro <%=cont%>:</label> 
        <label>Nombre: </label> <%=usu.getNombre()%><br>
        <label>Apeliido: </label> <%=usu.getApellido()%><br>
        <label>Edad: </label> <%=usu.getEdad()%><br>
        <br>
        <%cont = cont+1;
            }%>
        
    </body>
</html>
