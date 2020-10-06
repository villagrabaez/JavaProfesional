package Switch;

public class Main {
  public static void main(String[] args) {
    // break: nos permite terminar una secuencia de instrucciones, nos permite salir de un ciclo.
    // continue: nos permite pasar a la siguiente iteración dentro de un ciclo.
    int valor = 1;

    switch (valor) {
      case 10:
        System.out.println("El valor es: " + valor);
        break;
      default:
        System.out.println("No es 10");
    }

    for (int i = 0; i < 3; i++) {
      System.out.print("Siguiente " + i + ": ");

      for (int j = 0; j < 100; j++) {
        if (j == 10) {
          break;
        }
        System.out.print(j + " ");
      }

      System.out.println();
    }
    System.out.println("Ciclo finalizado.");

    // Continue
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
      System.out.println("Valor actual: "+ i);
    }
  }
}
