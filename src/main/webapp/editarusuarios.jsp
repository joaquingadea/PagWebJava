
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%HttpSession sesion = request.getSession();
          Usuario us = (Usuario) sesion.getAttribute("usuario_edicion");
        %>
        <h1>Edicion de usuario</h1>
        <h2>Usuario: </h2>
        <form action="SVEditar" method="POST">
            <div><label>Id: </label><%=us.getId()%></div>
            <div><label>Nombre: </label><input type="text" name="nombre" value=<%=us.getNombre()%>></div>
            <div><label>Apellido: </label><input type="text" name="apellido" value=<%=us.getApellido()%>></div>
            <div><label>Edad: </label><input type="text" name="edad" value=<%=us.getEdad()%>></div>
            <button type="submit">Editar</button>
        </form>
        
        
    </body>
</html>
