package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraL;
import logica.Usuario;

@WebServlet(name = "SVEditar", urlPatterns = {"/SVEditar"})
public class SVEditar extends HttpServlet {
    Usuario usu = new Usuario();
    ControladoraL control = new ControladoraL();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        HttpSession sesion = request.getSession();
        int id = Integer.parseInt(request.getParameter("id_usuario"));
        usu = control.traerUsuario(id);
        sesion.setAttribute("usuario_edicion", usu);
        response.sendRedirect("editarusuarios.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        HttpSession sesion = request.getSession();
        
        Usuario usuEd = (Usuario)sesion.getAttribute("usuario_edicion");
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        int edad = Integer.parseInt(request.getParameter("edad"));
        
        usuEd.setNombre(nombre);
        usuEd.setApellido(apellido);
        usuEd.setEdad(edad);
        
        control.editarUsuario(usuEd);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
