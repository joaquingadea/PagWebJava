package persistencia;

import java.util.List;
import logica.Usuario;

public class ControladoraP {
UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }

    public void altaUsuario(Usuario usuAlta) {
        usuarioJpa.create(usuAlta);
    }
    
}
