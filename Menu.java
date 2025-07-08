
package ProyectoG5;
import javax.swing.JOptionPane;
/**
 *
 * @author paoca
 */
public class Menu {

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            String menuPrincipal = "=== MENÚ PRINCIPAL ===\n" +
                                   "1. Gestión de Usuarios\n" +
                                   "2. Catálogos de Ciencia y Robótica\n" +
                                   "3. Registro de Participaciones y Logros\n" +
                                   "4. Salir";
            
            String opcionStr = JOptionPane.showInputDialog(null, menuPrincipal, "Menú Principal", JOptionPane.QUESTION_MESSAGE);
            if (opcionStr == null) break;  // Salir si cierran el cuadro
            int opcion = Integer.parseInt(opcionStr.trim());

            switch (opcion) {
                case 1:
                    mostrarMenuGestionUsuarios();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Funcionalidad en construcción.", "Catálogos de Ciencia y Robótica", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Funcionalidad en construcción.", "Registro de Participaciones y Logros", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }       
    }
    
    public static void mostrarMenuGestionUsuarios() {
        boolean salir = false;
       Modulo1 modulo1 = new Modulo1();

        while (!salir) {
            String menu = "=== MENÚ PRINCIPAL ===\n" +
                          "1. Agregar Usuario\n" +
                          "2. Consultar Usuario\n" +
                          "3. Inactivar Usuario\n" +
                          "4. Volver al menú principal";
            String opcionStr = JOptionPane.showInputDialog(null, menu, "Menú Gestión de usuarios", JOptionPane.QUESTION_MESSAGE);
            if (opcionStr == null) break; // Salir si cierran el cuadro
            int opcion = Integer.parseInt(opcionStr.trim());

            switch (opcion) {
                case 1:
                    modulo1.agregarUsuario();
                    break;
                case 2:
                   modulo1.consultarUsuario();
                    break;
                case 3:
                    modulo1.inactivarUsuario();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
