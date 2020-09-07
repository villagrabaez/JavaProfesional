package Variables;

public class Variables {
  public static <db_name> void main(String[] args) {
    /*
    * 4 tipos de datos
    *
    * Enteros
    *   > byte
    *   > short
    *   > int
    *   > long
    * Decimales
    *   > float
    *   > double
    * Caracter
    *   > char
    * Booleans
    *   > boolean
    * */

    // Declaración de variable entero
    int version;
    version = 10;
    version = 11;
    version = 12;
    System.out.println(version);

    int versionJava = 9;
    int nuevaVersionJava = 10;
    versionJava = nuevaVersionJava;
    System.out.println(versionJava);

    // Declaración de variable flotante
    float edad = 18.5f;
    float pi = 3.1415f;
    System.out.println(edad);
    System.out.println(pi);

    // Declaración de variable booleano
    boolean status = !true;
    System.out.println(status);

    // Declaración de variable caracter
    String nombre = "Bernardino Villagra Báez";
    System.out.println(nombre);

    // Declaración de variable char -> simbolos
    char letra = 'a';
    char numero = 64;
    System.out.println(letra);
    System.out.println(numero);

    // Declaración de variables en una sola linea
    int variable1 = 1, variable2 = 2, variable3 = 3;

    System.out.println(variable1);
    System.out.println(variable2);
    System.out.println(variable3);

    // Declaración de constantes

    final String db_name = "hiper_db";
    final int db_port = 8000;

    System.out.println(db_name);
    System.out.println(db_port);
  }
}
