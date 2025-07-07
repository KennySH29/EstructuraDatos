package ProyectoG5;

import javax.swing.JOptionPane;

/**
 *
 * @author paoca
 */
public class Usuario {
    private String nombreCompleto;
    private String password;
    private String nickName;
    private boolean estado;
    
    
    public Usuario(){
        this.nombreCompleto = "";
        this.password= "";
        this.nickName = "";
        this.estado = false;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
}

