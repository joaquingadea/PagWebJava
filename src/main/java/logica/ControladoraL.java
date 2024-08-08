package logica;

import java.util.List;
import persistencia.ControladoraP;

public class ControladoraL {
ControladoraP controlP = new ControladoraP();
    public List<Usuario> traerUsuarios() {
        return controlP.traerUsuarios();
    }

    public void altaUsuario(Usuario usuAlta) {
        controlP.altaUsuario(usuAlta);
    }

    public void eliminarUsuario(int id) {
        controlP.eliminarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlP.traerUsuario(id);
    }

    public void editarUsuario(Usuario usuEd) {
       controlP.editarUsuario(usuEd);
    }
   
}
