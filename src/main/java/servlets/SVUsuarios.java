
package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Usuario;

@WebServlet(name = "SVUsuarios", urlPatterns = {"/SVUsuarios"})
public class SVUsuarios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //BASES DE DATOS LOGICA
        Usuario u = new Usuario("Julio","Gutierrez",13);
        Usuario u1 = new Usuario("Michael","Jackson",40);
        Usuario u2 = new Usuario("Bruno","Diaz",31);
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(u);
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);
        //--------------------------
        
        //entender que pasa aca
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios",listaUsuarios);
        response.sendRedirect("mostrarUsuarios.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        System.out.println(nombre);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
