package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraP {
UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }

    public void altaUsuario(Usuario usuAlta) {
        usuarioJpa.create(usuAlta);
    }

    public void eliminarUsuario(int id) {
    try {
        usuarioJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControladoraP.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public Usuario traerUsuario(int id) {
        return usuarioJpa.findUsuario(id);
        
    }

    public void editarUsuario(Usuario usuEd) {
    try {
        usuarioJpa.edit(usuEd);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraP.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
