package LeerDatos;

import javax.swing.JOptionPane;

public class OptionPane {
  public static void main(String[] args) {
    String nombre = JOptionPane.showInputDialog(null, "¿Cuál es su nombre?");
    String apellido = JOptionPane.showInputDialog(null, "¿Cuál es su apellido?");
    int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es su altura?"));

    String mensaje = "Hola, " + nombre + " " + apellido + " Tu altura es: " + altura;

    JOptionPane.showMessageDialog(null, mensaje);
  }
}
