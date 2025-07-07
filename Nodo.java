
package ProyectoG5;

/**
 *
 * @author paoca
 */
public class Nodo {
    private Usuario elemento;
    private Nodo siguiente;
    
    public Nodo (){
        this.siguiente = null;
    }

    public Usuario getElemento() {
        return elemento;
    }

    public void setElemento(Usuario elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}   
