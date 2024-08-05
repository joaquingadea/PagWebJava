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
   
}
