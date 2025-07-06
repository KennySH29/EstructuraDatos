package ProyectoG5;

import javax.swing.JOptionPane;

/**
 *
 * @author paoca
 */
public class Usuario {
    private String nombreCompleto;
    private String nickname;
    private String contrasena;
    private boolean estado; // true = Activo, false = Inactivo

    public Usuario(String nombreCompleto, String nickname, String contrasena, boolean estado) {
        this.nombreCompleto = nombreCompleto;
        this.nickname = nickname;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    // Método para inactivar un usuario
    public static void inactivarUsuario() {
        JOptionPane.showMessageDialog(null, "Funcionalidad para inactivar usuario aún no implementada", "Inactivar usuario", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Método para agregar un usuario
    public static Usuario agregarUsuario() {
        String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo:");
        String nickname = JOptionPane.showInputDialog("Ingrese el nickname:");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña:");
        String estadoStr = JOptionPane.showInputDialog("Estado (1=Activo, 0=Inactivo):");
        boolean estado = Integer.parseInt(estadoStr.trim()) == 1;

        Usuario usuario = new Usuario(nombreCompleto, nickname, contrasena, estado);

        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        return usuario;
    }
}
