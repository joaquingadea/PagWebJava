
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pagina jsp</title>
    </head>
    <body>
        
        <h1>Datos usuarios:</h1>
        
        <form action="SVUsuarios" method = "POST">
            
            <label>Nombre: </label><input type="text" name="nombre">
            <button type="submit">Enviar</button>
        </form>
        
        
        <h3>Haga click en el siguiente boton para ver los usuarios</h3>
        <form action="SVUsuarios" method="GET">
            <button>Mostrar usuarios</button>
        </form>  
    </body>
</html>
