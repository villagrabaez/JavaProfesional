package Strings;

public class Main {
  public static void main(String[] args) {
    /**
     * String = El String no es una variable primitiva, sino una Clase
     */

    String mensaje = "Hola, soy un String";
    String mensaje2 = new String("Texto");

    System.out.println(mensaje);
    System.out.println(mensaje2);

    /**
     * Metodos para cadenas
     */

    // length
    int tamanoTexto = mensaje.length();
    System.out.println(tamanoTexto);

    // contains
    boolean contain = mensaje.contains("Hola");
    System.out.println(contain);

    // startsWith
    boolean startWith = mensaje.startsWith("Hola");
    System.out.println(startWith);

    // endWith
    boolean endWith = mensaje.endsWith("String");
    System.out.println(endWith);

    // concat
    String mensajeConcat = mensaje.concat(". Estamos en el curso de Java");
    System.out.println(mensajeConcat);

    // toUpperCase
    String upperCase = mensaje.toUpperCase();
    System.out.println(upperCase);

    // toLowerCase
    String lowerCase = mensaje.toLowerCase();
    System.out.println(lowerCase);

    // trim
    String nuevoMensaje = "   Hola, soy un mensaje con espacios al inicio y al final.   ";

    // En Java podemos encadenar metodos
    System.out.println( nuevoMensaje.trim().toUpperCase() );

    // format
    String formatMensaje = "";
    String curso = "Java";
    curso = "PHP";

    formatMensaje = String.format("Bienvenido al curso %s", curso);
    System.out.println(formatMensaje);

    float valor = 10.872040f;
    // String formatMensaje2 = String.format("El total de %d articulos es %.3f %s", 3, valor, "GS");
    System.out.printf("El total de %d articulos es %.3f %s", 3, valor, "GS");

    // Comparar Strings

    String cadena1 = "Hola";
    String cadena2 = "hola";

    // boolean resultado = cadena1.equals(cadena2);
    boolean resultado = cadena1.toUpperCase().equals(cadena2.toUpperCase());
    System.out.println("\n" + resultado);

    boolean resultado2 = cadena1.equalsIgnoreCase(cadena2);
    System.out.println(resultado2);

    // concatenación

    String texto1 = "Primer texto ", texto2 = "Segundo texto ", texto3 = "Tercer texto";
    String textoCompleto = texto1 + texto2 + texto3;
    System.out.println(textoCompleto);

  }
}
