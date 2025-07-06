
package ProyectoG5;

/**
 *
 * @author paoca
 */
public class Nodo {
    private Usuario usuario;
    private Nodo siguiente;
    
    public Nodo (){
        this.usuario = usuario;
        this.siguiente = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}   
