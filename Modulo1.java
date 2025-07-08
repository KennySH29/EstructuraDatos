package ProyectoG5;
import javax.swing.JOptionPane;

public class Modulo1 {
  private Nodo inicio;

public Modulo1(){
    this.inicio = null;
}  

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    public boolean esVacia(){
        if(inicio== null){
            return true;
        }else{
            return false;
        }
    }
    
    //No esta Terminado//
    public void agregarUsuarios(){
        Usuario e = new Usuario();
        e.setNombreCompleto(JOptionPane.showInputDialog(null, "Ingrese el Nombre completo: "));
        e.setNickName(JOptionPane.showInputDialog(null, "Ingrese el nickname: "));
        e.setPassword(JOptionPane.showInputDialog(null, "Ingrese la contraseña: "));
        e.setEstado(true);
        
        Nodo nuevo = new Nodo();
        nuevo.setElemento(e);
        
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente al la Lista.");
      }
    
    public void consultarUsuarios(){
        //SE MUESTRA LA INFOEMACION DE LOS USUARIOS CON LAS BUSQUEDA DEL NICKNAME ESPECIFICO
        if(!esVacia()){
            Nodo aux = inicio;
            boolean encontrado = false;
            String nomb=JOptionPane.showInputDialog(null,
                 "Digite el nickname del usuario que desea consultar:");
            while(aux != null){
                if(nomb.equals(aux.getElemento().getNickName())){
                    //SE MUESTRA LA INFIRMACION A CONSULTAR
                    String info = "Nombre: " + aux.getElemento().getNombreCompleto()+ 
                                  "\nNickname: " + aux.getElemento().getNickName()+
                                  "\nEstado: " + aux.getElemento().isEstado() + " TRUE/ACTIVO, FALSE/INACTIVO" +//EN PROCESO
                                  "\nContraseña: " + aux.getElemento().getPassword() + "\n"; //NO DEBERIA MOSTRARSE POR SEGURIDAD
                    JOptionPane.showMessageDialog(null, info);
                    encontrado = true;
                    break;
                
                }
                aux = aux.getSiguiente();
                
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            }
                
        }
        
    }
    public void inactivarUsuarios(){
               //SE INACTIVAN LOS USUARIOS CON LAS BUSQUEDA DEL NICKNAME
            if(!esVacia()){
                String nick = JOptionPane.showInputDialog(null, "Ingrese el nickname del usuario que desea inactivar: ");
                Nodo aux = inicio;
                boolean encontrado = false;
                while (aux!=null){
                    if(aux.getElemento().getNickName().equalsIgnoreCase(nick)){
                        
                        ///FUNCIONES FUTURAS: VERIFICAR SI TIENE MENTORIAS  O PROYECTOS ACTIVOS//
                       
                   
                    aux.getElemento().setEstado(false);
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Usuario " + aux.getElemento().getNickName() + " Inactivado");
                    break;
                }
                aux = aux.getSiguiente();
                }
                if(!encontrado){
                    JOptionPane.showInputDialog(null, "Usuario no encontrado");
                }
            }
            
    }
        
}
