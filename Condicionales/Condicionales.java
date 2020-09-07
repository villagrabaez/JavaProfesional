package Condicionales;

public class Condicionales {
  public static void main(String[] args) {
    // Condicional

    /**
     * if
     * else if
     * else
     */

    String colorLuz = "Verde";
    colorLuz = "Amarillo";

    if ( colorLuz.equals("Verde") ) {
      System.out.println("Azanza");
    } else if ( colorLuz.equals("Amarillo") ) {
      System.out.println("Cuidado");
    } else if ( colorLuz.equals("Rojo") ) {
      System.out.println("Pare");
    } else {
      System.out.println("Semaforo fuera de servicio. Circule con cuidado");
    }

    /**
     * Condiciones anidadas
     */

    int promedio = 10;

    if ( promedio >= 7 ) {
      if ( promedio == 10 ) {
        System.out.printf("Muchas Felicidades! aprobaste con la calificación más alta de %d", promedio);
      } else {
        System.out.printf("Felicidades! aprobaste el curso con una nota de %d", promedio);
      }
    } else {
      System.out.printf("No has aprobado, tendrás que esforzarte un poco más. Tu calificación fue %d", promedio);
    }

    /**
     * Scope o Alcance
     */

    int calificacion = 5;

    if ( calificacion >= 7 ) {
      if ( calificacion == 10 ) {
        String mensaje = "Muchas Felicidades! aprobaste con la calificación más alta";
        System.out.println(mensaje);
      } else {
        String mensaje = "Felicidades! aprobaste el curso";
        System.out.println(mensaje);
      }
    } else {
      String mensaje = "No has aprobado, tendrás que esforzarte un poco más";
      System.out.println(mensaje);
    }

    /**
     * Sentencia Switch
     */

    String luzColor = "Off";

    switch ( luzColor ) {
      case "Verde":
        System.out.println("Avanza");
        break;
      case "Amarillo":
        System.out.println("Cuidado");
        break;
      case "Rojo":
        System.out.println("Pare");
        break;
      default:
        System.out.println("Semaforo fuera de servicio. Conduzca con cuidado.");
    }
  }
}
